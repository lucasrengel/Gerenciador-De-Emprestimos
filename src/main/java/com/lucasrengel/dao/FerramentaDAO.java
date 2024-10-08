package com.lucasrengel.dao;

import com.lucasrengel.modelo.Ferramenta;

import java.sql.*;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Ferramenta, contendo métodos para realizar operações de CRUD no banco de dados.
public class FerramentaDAO {

    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
    double precoTotal;

    public ArrayList getMinhaLista() {

        minhaLista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double preco = res.getDouble("preco");

                Ferramenta objeto = new Ferramenta(id, nome, marca, preco);

                minhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return minhaLista;

    }

    //cria uma ferramenta a partir de um objeto
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramentas(id,nome,marca,preco)VALUES(?,?,?,?)";

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
            stmt.execute("DELETE FROM tb_ferramentas WHERE id = " + id);
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

    public Ferramenta selectFerramentaBD(int id) {

        Ferramenta objeto = new Ferramenta();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setPreco(res.getDouble("preco"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }

    public double getTotal() {
        ResultSet res;

        try {
            Statement stmt = this.getConexao().createStatement();
            res = stmt.executeQuery("SELECT SUM(preco) FROM tb_ferramentas");
            if (res.next()) {
                precoTotal = res.getDouble("SUM(preco)");
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

        return precoTotal;
    }

    public boolean isFerramentaEmprestada(int ferramentaId) {
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement("SELECT COUNT(*) FROM tb_emprestimos WHERE id_ferramenta = ? AND data_devolucao IS NULL");
            stmt.setInt(1, ferramentaId);
            ResultSet res = stmt.executeQuery();

            res.next();
            int count = res.getInt(1);

            stmt.close();
            return count > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
