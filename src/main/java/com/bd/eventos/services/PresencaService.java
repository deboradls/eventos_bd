package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Presenca;
import com.bd.eventos.repositories.PresencaRepository;

@Service
public class PresencaService {
    @Autowired
    private PresencaRepository repository;

    public Presenca criarPresenca(Presenca presenca) {
        return repository.save(presenca);
    }

    public List<Presenca> listarPresencas() {
        return repository.findAll();
    }

    public Presenca listarPresencaPorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarPresenca(Long id) {
        repository.deleteById(id);
    }
}
