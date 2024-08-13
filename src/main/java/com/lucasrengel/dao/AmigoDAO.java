package com.lucasrengel.dao;

import com.lucasrengel.modelo.Amigo;

import java.sql.*;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Amigo, contendo métodos para realizar operações de CRUD no banco de dados.
public class AmigoDAO {

    public static ArrayList<Amigo> minhaLista = new ArrayList<>();
    
     //retorna a lista de amigos
    public ArrayList getMinhaLista() {

        minhaLista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Amigo objeto = new Amigo(id, nome, telefone);

                minhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return minhaLista;
    }

    //cadastra um novo amigo com o objeto criado
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigos(id,nome,telefone) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
