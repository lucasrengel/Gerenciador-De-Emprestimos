package com.lucasrengel.dao;

import com.lucasrengel.modelo.Emprestimo;
import java.sql.Connection;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Emprestimo, contendo métodos para realizar operações de CRUD no banco de dados.
public class EmprestimoDAO {

    public static ArrayList<Emprestimo> minhaLista = new ArrayList<>();
    //transformar os IDs em objetos
    AmigoDAO amigoDAO = new AmigoDAO();
    FerramentaDAO ferramentaDAo = new FerramentaDAO();
    
    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
