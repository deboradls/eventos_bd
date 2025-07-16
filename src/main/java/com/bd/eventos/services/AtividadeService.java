package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Atividade;
import com.bd.eventos.repositories.AtividadeRepository;

@Service
public class AtividadeService {
    @Autowired
    private AtividadeRepository repository;

    public Atividade criarAtividade(Atividade atividade) {
        return repository.save(atividade);
    }

    public List<Atividade> listarAtividades() {
        return repository.findAll();
    }

    public Atividade listarAtividadePorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarAtividade(Long id) {
        repository.deleteById(id);
    }
}
