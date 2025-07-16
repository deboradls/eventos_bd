package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Eventos;
import com.bd.eventos.repositories.EventosRepository;

@Service
public class EventoService {
    @Autowired
    private EventosRepository repository;

    public Eventos criarEvento(Eventos evento) {
        return repository.save(evento);
    }

    public List<Eventos> listarEventos() {
        return repository.findAll();
    }

    public Eventos listarEventoPorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarEvento(Long id) {
        repository.deleteById(id);
    }
}
