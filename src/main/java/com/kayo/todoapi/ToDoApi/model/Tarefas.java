    package com.kayo.todoapi.ToDoApi.model;

    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;

    @Entity
    @Table(name= "Tarefas")
    public class Tarefas {

        @Id
        @Column(name= "id")
        private String id;
        @Column(name= "titulo")
        private String titulo;
        @Column(name= "descricao")
        private String descricao;
        @Column(name= "status")
        private String status;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
