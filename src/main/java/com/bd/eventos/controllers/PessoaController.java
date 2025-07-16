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

import com.bd.eventos.entities.Pessoa;
import com.bd.eventos.services.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired
    private PessoaService service;

    @GetMapping()
    public List<Pessoa> listarPessoas() {
        return service.listarPessoas();
    }

    @GetMapping("{id}")
    public Pessoa listarPessoaPorId(@PathVariable Long id) {
        return service.listarPessoaPorId(id);
    }
    
    @PostMapping()
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return service.criarPessoa(pessoa);
    }
    
    @PutMapping()
    public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa) {
        return service.criarPessoa(pessoa);
    }

    @DeleteMapping("{id}")
    public void deletePessoa(@PathVariable Long id) {
        try {
            service.deletarPessoa(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
