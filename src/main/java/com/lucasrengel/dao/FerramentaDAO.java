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
    public boolean insertFerramentaBD(Ferramenta objeto){
        String sql = "INSERT INTO tb_ferramentas(id,nome,marca,custo)VALUES(?,?,?,?)";

        try{
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getPreco());

            stmt.execute();
            stmt.close();

            return true;
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }

    public boolean deleteFerramentaBD(int id){
        try{
            Statement stmt = this.getConexao().createStatement();
            stmt.execute("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();

        }catch (SQLException erro){
            throw new RuntimeException(erro);
        }
        return true;
    }

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
