package org.example;

public class Contato {
    private String nome;
    private Endereco endereco;
    private Telefone telefones;

    public Contato(String nome, Telefone telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}