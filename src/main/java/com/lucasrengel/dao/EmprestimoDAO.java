package com.lucasrengel.dao;

import com.lucasrengel.modelo.Amigo;
import com.lucasrengel.modelo.Emprestimo;
import com.lucasrengel.modelo.Ferramenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public boolean insertEmprestimoBD(Emprestimo emprestimo) {

        if (ferramentaDAO.isFerramentaEmprestada(emprestimo.getIdFerramenta().getId())) {
            throw new RuntimeException("Esta ferramenta já está emprestada. Não é possível realizar um novo empréstimo.");
        }

        if (amigoPendente(emprestimo.getIdAmigo().getId(), emprestimo.getId()) != 0) {
            throw new RuntimeException("O amigo já tem uma ferramenta emprestada e não devolveu.");
        }

        String sql = "INSERT INTO tb_emprestimos (id_amigo, id_ferramenta, data_emprestimo, data_devolucao) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, emprestimo.getIdAmigo().getId());
            stmt.setInt(2, emprestimo.getIdFerramenta().getId());
            stmt.setDate(3, emprestimo.getDataEmprestimo());
            stmt.setDate(4, emprestimo.getDateDevolucao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int amigoPendente(int idAmigo, int idEmprestimo) {
        int idFerramenta = 0;

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet pdt = stmt.executeQuery("SELECT id_ferramenta FROM `tb_emprestimos` WHERE `id_amigo` = " + idAmigo + " AND `data_devolucao` IS NULL AND `id` != " + idEmprestimo);

            if (pdt.next()) {
                idFerramenta = pdt.getInt("id_ferramenta");
            }

            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.getConexao().close();
            } catch (Exception e) {
            }
            try {
                this.getConexao().close();
            } catch (Exception e) {
            }
        }

        return idFerramenta;
    }

    //metodo para se conectar ao banco de dados
    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
