package com.lucasrengel.modelo;

public class Ferramenta {

    private int id;
    private String nome;
    private String marca;
    private double preco;

    public Ferramenta() {
    }

    //construtor sem id para o auto incremental do banco de dados
    public Ferramenta(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public Ferramenta(int id, String nome, String marca, double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Ferramenta: " + nome + ", Marca: " + marca + ", Preco: " + preco;
    }
}
