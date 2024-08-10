package com.lucasrengel.dao;

import com.lucasrengel.modelo.Ferramenta;
import java.sql.Connection;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Ferramenta, contendo métodos para realizar operações de CRUD no banco de dados.
public class FerramentaDAO {

    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
    double custoTotal;
    
    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
