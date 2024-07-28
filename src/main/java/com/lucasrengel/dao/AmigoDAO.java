package com.lucasrengel.dao;

import com.lucasrengel.modelo.Amigo;
import java.sql.Connection;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Amigo, contendo métodos para realizar operações de CRUD no banco de dados.
public class AmigoDAO {

    public static ArrayList<Amigo> minhaLista = new ArrayList<>();

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
