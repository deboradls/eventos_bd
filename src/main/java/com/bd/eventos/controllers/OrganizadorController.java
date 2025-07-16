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

import com.bd.eventos.entities.Organizador;
import com.bd.eventos.services.OrganizadorService;

@RestController
@RequestMapping("organizador")
public class OrganizadorController {
    @Autowired
    private OrganizadorService service;

    @GetMapping()
    public List<Organizador> listarOrganizadores() {
        return service.listarOrganizadores();
    }

    @GetMapping("{id}")
    public Organizador listarOrganizadorPorId(@PathVariable Long id) {
        return service.listarOrganizadorPorId(id);
    }
    
    @PostMapping()
    public Organizador criarOrganizador(@RequestBody Organizador organizador) {
        return service.criarOrganizador(organizador);
    }
    
    @PutMapping()
    public Organizador atualizarOrganizador(@RequestBody Organizador organizador) {
        return service.criarOrganizador(organizador);
    }

    @DeleteMapping("{id}")
    public void deleteOrganizador(@PathVariable Long id) {
        try {
            service.deletarOrganizador(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
