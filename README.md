# Criptografia
Implementação de criptografia em um serviço de forma transparente para a API e para as camadas de
serviço da aplicação. O objetivo é garantir que os campos sensíveis dos objetos de entidade não sejam visíveis
diretamente, realizando a criptografia em tempo de execução durante a conversão da entidade para a coluna correspondente
no banco de dados, e vice-versa.

## Exemplo
Considere os campos `userDocument` e `creditCardToken` como campos sensíveis que devem ser criptografados. A tabela de
exemplo seria a seguinte:

| id | userDocument     | creditCardToken | value |
|:---|:-----------------|:----------------|:------|
| 1  | MzYxNDA3ODE4MzM= | YWJjMTIz        | 5999  |
| 2  | MzI5NDU0MTA1ODM= | eHl6NDU2        | 1000  |
| 3  | NzYwNzc0NTIzODY= | Nzg5eHB0bw==    | 1500  |

A estrutura da entidade correspondente seria a seguinte:

| Campo           | Tipo   |
|:----------------|:-------|
| id              | Long   |
| userDocument    | String |
| creditCardToken | String |
| value           | Long   |

## **Ferramentas Utilizadas para Desenvolvimento**

```
IntelliJ IDEA
DBeaver
Postman
Spring Boot   
Java
MySQL
Docker
```

## **Dependências**

O desenvolvimento de código em Java, em geral, usufrui de um significativo conjunto de bibliotecas e _frameworks_. Esta
reutilização é incorporada em um projeto por meio de dependências. Para gerenciar foi utilizado o _Maven_.

```
Spring Web
Spring Data JPA
MySQL Driver
```

## **Métodos**

Requisições para a API devem seguir os padrões:

| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |

## **Respostas**

| Status | Descrição                                                          |
|--------|--------------------------------------------------------------------|
| `200`  | Requisição executada com sucesso (success).                        |
| `201`  | Requisição executada com sucesso (success).                        |
| `400`  | Erros de validação ou os campos informados não existem no sistema. |
| `409`  | Conflito.                                                          |
| `405`  | Método não implementado.                                           |

# **Recursos da API**

| Método     | Endpoint                                             |
|------------|---------------------------------------------------|
| `GET`      | /transactions                                     |
| `GET`      | /transactions/{id}                                |
| `POST`     | /transactions                                     |
| `PUT`      | /transactions/{id}                                |
| `DELETE`   | /transactions/{id}                                |
