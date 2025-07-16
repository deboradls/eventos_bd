package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Inscricao;
import com.bd.eventos.repositories.InscricaoRepository;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository repository;

    public Inscricao criarInscricao(Inscricao inscricao) {
        return repository.save(inscricao);
    }

    public List<Inscricao> listarInscricoes() {
        return repository.findAll();
    }

    public Inscricao listarInscricaoPorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarInscricao(Long id) {
        repository.deleteById(id);
    }
}
