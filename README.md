# Contact book

Este é um projeto de uma agenda de contatos desenvolvido em Java puro. O objetivo é criar uma aplicação que permita armazenar informações 
de contatos, incluindo nome, endereço e telefone.

## Classes

O projeto possui as seguintes classes:

### Classe Contato

A classe `Contato` representa um contato na agenda e possui os seguintes atributos:

- `nome`: nome do contato.
- `endereco`: objeto do tipo `Endereco` que armazena as informações de endereço do contato.
- `telefone`: objeto do tipo `Telefone` que armazena as informações de telefone do contato.

A classe `Contato` possui um construtor que recebe objeto `Telefone` e o atributo `nome'` do contato. Além disso, possui os métodos getter e setter para o atributo `endereco`.

### Classe Endereco

A classe `Endereco` representa as informações de endereço de um contato e possui os seguintes atributos:

- `nomeRua`: nome da rua.
- `numero`: número da residência.
- `complemento`: complemento do endereço.
- `cep`: CEP.
- `cidade`: cidade.
- `estado`: estado.

A classe `Endereco` possui um construtor que recebe os parâmetros necessários para inicializar os atributos.

### Classe Telefone

A classe `Telefone` representa as informações de telefone de um contato e possui os seguintes atributos:

- `tipo`: tipo de telefone (exemplo: celular, residencial).
- `ddd`: DDD do telefone.
- `numero`: número do telefone.

A classe `Telefone` possui um construtor que recebe os parâmetros necessários para inicializar os atributos.

## Como executar o projeto

1. Faça o clone deste repositório.
2. Abra o projeto em sua IDE de preferência.
3. Compile e execute a classe principal para iniciar a aplicação.

## Contribuições

Contribuições são bem-vindas! Se você deseja contribuir com melhorias ou correções para este projeto, sinta-se à vontade para abrir uma pull request.