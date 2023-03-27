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

    public String getNomeRua() {
        return nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
