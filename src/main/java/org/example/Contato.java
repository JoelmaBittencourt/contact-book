package org.example;

public class Contato {
   private static String nome;
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

    public String getNome() {
        return nome;
    }

    public Telefone getTelefones() {
        return telefones;
    }
}
