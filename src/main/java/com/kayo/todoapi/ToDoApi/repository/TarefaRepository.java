package com.kayo.todoapi.ToDoApi.repository;

import com.kayo.todoapi.ToDoApi.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefas, String> {
    List<Tarefas> findByTitulo(String titulo );

}
