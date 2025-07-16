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

import com.bd.eventos.entities.Eventos;
import com.bd.eventos.services.EventoService;

@RestController
@RequestMapping("evento")
public class EventoController {
    @Autowired
    private EventoService service;

    @GetMapping()
    public List<Eventos> listarEventos() {
        return service.listarEventos();
    }

    @GetMapping("{id}")
    public Eventos listarEventoPorId(@PathVariable Long id) {
        return service.listarEventoPorId(id);
    }
    
    @PostMapping()
    public Eventos criarEvento(@RequestBody Eventos evento) {
        return service.criarEvento(evento);
    }
    
    @PutMapping()
    public Eventos atualizarEvento(@RequestBody Eventos evento) {
        return service.criarEvento(evento);
    }

    @DeleteMapping("{id}")
    public void deleteEvento(@PathVariable Long id) {
        try {
            service.deletarEvento(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
