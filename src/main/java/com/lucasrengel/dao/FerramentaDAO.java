package com.lucasrengel.dao;

import com.lucasrengel.modelo.Ferramenta;

import java.sql.*;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Ferramenta, contendo métodos para realizar operações de CRUD no banco de dados.
public class FerramentaDAO {

    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
    double custoTotal;

    public ArrayList getMinhaLista() {

        minhaLista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custo = res.getDouble("custo");

                Ferramenta objeto = new Ferramenta(id, nome, marca, custo);

                minhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return minhaLista;

    }

    //cria uma ferramenta a partir de um objeto
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramentas(id,nome,marca,custo)VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getPreco());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    //delete uma ferramenta a partir do id
    public boolean deleteFerramentaBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.execute("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return true;
    }

    //atualiza uma ferramenta a partir de um objeto
    public boolean updateFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE tb_ferramentas SET nome = ? , marca = ? , preco = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getPreco());
            stmt.setInt(4, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public double getTotal() {
        ResultSet res;

        try {
            Statement stmt = this.getConexao().createStatement();
            res = stmt.executeQuery("SELECT SUM(preco) FROM tb_ferramentas");
            if (res.next()) {
                custoTotal = res.getDouble("SUM(preco)");
            }
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        } finally {
            try {
                this.getConexao().close();
            } catch (Exception e) {
            }
        }

        return custoTotal;
    }

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
