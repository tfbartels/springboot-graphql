# Spring Boot GraphQL

## Projeto

Spring Boot GraphQL é um simples projeto de Posts servindo de exemplo para demonstrar a utilização do GraphQL junto ao Spring Boot.

## Tecnologias

Este projeto foi desenvolvido com as tecnologias

- [Java 11]
- [Spring Boot]
- [GraphQL]
- [H2 Database]


## Como utilizar

### Através do browser
Acesse o endereço http://localhost:8080/graphiql

### Através de requisições

Faça uma requisição do tipo POST para o endereço http://localhost:8080/graphql
Envie no corpo da requisição a query desejada.

```bash
query{
  posts {
    id
    text
    date
  }
}

```