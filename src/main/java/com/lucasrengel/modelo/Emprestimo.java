package com.lucasrengel.modelo;

import java.sql.Date;

public class Emprestimo {

    private int id;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Amigo idAmigo;
    private Ferramenta idFerramenta;

    public Emprestimo() {
    }

    //construtor sem id para o auto incremental do banco de dados
    public Emprestimo(Date dataEmprestimo, Date dateDevolucao, Amigo idAmigo, Ferramenta idFerramenta) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dateDevolucao;
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
    }

    public Emprestimo(int id, Date dataEmprestimo, Date dateDevolucao, Amigo idAmigo, Ferramenta idFerramenta) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dateDevolucao;
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDateDevolucao() {
        return dataDevolucao;
    }

    public void setDateDevolucao(Date dateDevolucao) {
        this.dataDevolucao = dateDevolucao;
    }

    public Amigo getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(Amigo idAmigo) {
        this.idAmigo = idAmigo;
    }

    public Ferramenta getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(Ferramenta idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    @Override
    public String toString() {
        return "Id Emprestimo: " + id + ", Id Amigo: " + idAmigo + ", Id Ferramenta: " + idFerramenta
                + ", Data de Emprestimo:" + dataEmprestimo + ", Data de Devolucao=" + dataDevolucao;
    }

}
