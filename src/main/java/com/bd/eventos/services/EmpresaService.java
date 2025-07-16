package com.bd.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.eventos.entities.Empresa;
import com.bd.eventos.repositories.EmpresaRepository;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository repository;

    public Empresa criarEmpresa(Empresa empresa) {
        return repository.save(empresa);
    }

    public List<Empresa> listarEmpresas() {
        return repository.findAll();
    }

    public Empresa listarEmpresaPorId(Long id) {
        return repository.findById(id).get();
    }

    public void deletarEmpresa(Long id) {
        repository.deleteById(id);
    }
}
