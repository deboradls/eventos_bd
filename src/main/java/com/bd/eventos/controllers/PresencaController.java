package com.bd.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.eventos.entities.Presenca;
import com.bd.eventos.services.PresencaService;

@RestController
@RequestMapping("presenca")
public class PresencaController {
    @Autowired
    private PresencaService service;

    @GetMapping()
    public List<Presenca> listarPresencas() {
        return service.listarPresencas();
    }

    @GetMapping("{id}")
    public Presenca listarPresencaPorId(@PathVariable Long id) {
        return service.listarPresencaPorId(id);
    }
    
    @PostMapping()
    public Presenca criarPresenca(@RequestBody Presenca presenca) {
        return service.criarPresenca(presenca);
    }
    
    @PutMapping()
    public Presenca atualizarPresenca(@RequestBody Presenca presenca) {
        return service.criarPresenca(presenca);
    }

    @DeleteMapping("{id}")
    public void deletePresenca(@PathVariable Long id) {
        try {
            service.deletarPresenca(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
