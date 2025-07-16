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

import com.bd.eventos.entities.Inscricao;
import com.bd.eventos.services.InscricaoService;

@RestController
@RequestMapping("inscricao")
public class InscricaoController {
    @Autowired
    private InscricaoService service;

    @GetMapping()
    public List<Inscricao> listarInscricaos() {
        return service.listarInscricoes();
    }

    @GetMapping("{id}")
    public Inscricao listarInscricaoPorId(@PathVariable Long id) {
        return service.listarInscricaoPorId(id);
    }
    
    @PostMapping()
    public Inscricao criarInscricao(@RequestBody Inscricao inscricao) {
        return service.criarInscricao(inscricao);
    }
    
    @PutMapping()
    public Inscricao atualizarInscricao(@RequestBody Inscricao inscricao) {
        return service.criarInscricao(inscricao);
    }

    @DeleteMapping("{id}")
    public void deleteInscricao(@PathVariable Long id) {
        try {
            service.deletarInscricao(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
