package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Pessoa;
import com.bd.eventos.repositories.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public Pessoa criarPessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return repository.findAll();
    }

    public Pessoa listarPessoaPorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarPessoa(Long id) {
        repository.deleteById(id);
    }
}
