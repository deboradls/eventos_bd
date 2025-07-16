package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Organizador;
import com.bd.eventos.repositories.OrganizadorRepostiory;

@Service
public class OrganizadorService {
    @Autowired
    private OrganizadorRepostiory repository;

    public Organizador criarOrganizador(Organizador organizador) {
        return repository.save(organizador);
    }

    public List<Organizador> listarOrganizadores() {
        return repository.findAll();
    }

    public Organizador listarOrganizadorPorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarOrganizador(Long id) {
        repository.deleteById(id);
    }
}
