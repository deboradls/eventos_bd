package com.bd.eventos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.bd.eventos.entities.Atividade;
import com.bd.eventos.services.AtividadeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "atividade")
public class AtividadeController {

    @Autowired
    private AtividadeService service;

    @GetMapping()
    public List<Atividade> listarAtividades() {
        return service.listarAtividades();
    }

    @GetMapping("{id}")
    public Atividade listarAtividadePorId(@PathVariable Long id) {
        return service.listarAtividadePorId(id);
    }
    
    @PostMapping()
    public Atividade criarAtividade(@RequestBody Atividade atividade) {
        return service.criarAtividade(atividade);
    }
    
    @PutMapping()
    public Atividade atualizarAtividade(@RequestBody Atividade atividade) {
        return service.criarAtividade(atividade);
    }

    @DeleteMapping("{id}")
    public void deleteAtividade(@PathVariable Long id) {
        try {
            service.deletarAtividade(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
