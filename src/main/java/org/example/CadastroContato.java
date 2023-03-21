package org.example;

public class CadastroContato {

    public static void main(String[] args) {
        var endereco = new Endereco();
        endereco.setCep("jhiuhdi");


        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        var pessoa = new Contato();//criar verificação para evitar null pointer
        pessoa.setEndereco(endereco);
        pessoa.setTelefones(telefones);


        System.out.println(pessoa.getEndereco().getCep());
        System.out.println(pessoa.getTelefones());


    }
}