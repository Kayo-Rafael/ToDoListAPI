# ToDo List API

Este é um projeto de API RESTful para gerenciar tarefas de uma lista de afazeres (ToDo List). A API foi construída utilizando Spring Boot e armazena as tarefas em um banco de dados H2 em memória. As principais funcionalidades incluem adicionar, buscar, atualizar e deletar tarefas.

## Funcionalidades

- **POST /tarefas**: Cria uma nova tarefa.
- **GET /tarefas/{id}**: Recupera uma tarefa pelo ID.
- **PUT /tarefas/{id}**: Atualiza uma tarefa existente.
- **DELETE /tarefas/{id}**: Deleta uma tarefa pelo ID.
- **GET /tarefas**: Busca tarefas pelo título.

## Tecnologias Usadas

- **Spring Boot**: Framework para criação da API.
- **JPA/Hibernate**: Para persistência de dados com o banco de dados H2.
- **H2 Database**: Banco de dados em memória.
- **UUID**: Geração de IDs únicos para tarefas.

## Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/todo-list-api.git
