package com.kayo.todoapi.ToDoApi.controller;


import com.kayo.todoapi.ToDoApi.model.Tarefas;
import com.kayo.todoapi.ToDoApi.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    private TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @PostMapping
    public Tarefas salvarTarefa(@RequestBody Tarefas tarefas) {
        System.out.println("Tarefa Incluida com Sucesso " + tarefas);
        var id = UUID.randomUUID().toString();
        tarefas.setId(id);
        tarefaRepository.save(tarefas);
        return tarefas;
    }

    @GetMapping("/{id}")
    public Tarefas buscarTarefasPoriD(@PathVariable("id") String id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletarTarefa(@PathVariable("id") String id) {
        tarefaRepository.deleteById(id);
    }


    @PutMapping("{id}")
    public void atualizarTarefa(@RequestBody Tarefas tarefas, @PathVariable("id") String id) {
        tarefas.setId(id);
        tarefaRepository.save(tarefas);
    }


    @GetMapping
    public List<Tarefas> buscarTarefas(@RequestParam("titulo ") String titulo) {
        return tarefaRepository.findByTitulo(titulo);
    }
}