package org.example;

public class CadastroContato {

    public static void main(String[] args) {

        var Telefone = new Telefone("celular", "11", "9999-9999");
        Telefone.getddd();

        var Endereco = new Endereco("Rua bonita", "58", "000000-000",
                "city", "Sp");

        var Contato = new Contato("Jorge Silva", Telefone);
        Contato.setEndereco(Endereco);
    }
}