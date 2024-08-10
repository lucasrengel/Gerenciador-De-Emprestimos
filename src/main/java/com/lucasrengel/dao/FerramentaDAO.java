package com.lucasrengel.dao;

import com.lucasrengel.modelo.Ferramenta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
