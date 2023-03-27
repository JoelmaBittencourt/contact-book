package org.example;

public class CadastroContato {

    public static void main(String[] args) {

        var Telefone = new Telefone("celular", "11", "9999-9999");

        var Contato = new Contato("Jorge Silva", Telefone);

        var Endereco = new Endereco("Rua bonita", "58", "000000-000",
                "city", "Sp");

        Contato.setEndereco(Endereco);
       System.out.println( Contato.getEndereco().getCidade());


    }
}