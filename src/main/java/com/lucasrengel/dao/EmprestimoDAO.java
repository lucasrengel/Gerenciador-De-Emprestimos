package com.lucasrengel.dao;

import com.lucasrengel.modelo.Amigo;
import com.lucasrengel.modelo.Emprestimo;
import com.lucasrengel.modelo.Ferramenta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Classe DAO (Data Access Object) para a entidade Emprestimo, contendo métodos para realizar operações de CRUD no banco de dados.
public class EmprestimoDAO {

    public static ArrayList<Emprestimo> minhaLista = new ArrayList<>();
    //transformar os IDs em objetos
    AmigoDAO amigoDAO = new AmigoDAO();
    FerramentaDAO ferramentaDAO = new FerramentaDAO();

    public ArrayList getMinhaLista() {

        minhaLista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");

            while (res.next()) {
                int id = res.getInt("id");
                Amigo amigo = amigoDAO.selectAmigoBD(res.getInt("id_amigo"));
                Ferramenta ferramenta = ferramentaDAO.selectFerramentaBD(res.getInt("id_ferramenta"));
                java.sql.Date dataEmprestimo = res.getDate("data_emprestimo");
                java.sql.Date dataDevolucao = res.getDate("data_devolucao");

                Emprestimo objeto = new Emprestimo(id, amigo, ferramenta, dataEmprestimo, dataDevolucao);

                minhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.getConexao().close();
            } catch (SQLException e) {
            }
        }

        return minhaLista;
    }

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
