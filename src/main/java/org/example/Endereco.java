package org.example;

public class Endereco {
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String nomeRua, String numero, String cep, String cidade, String estado) {
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
}
