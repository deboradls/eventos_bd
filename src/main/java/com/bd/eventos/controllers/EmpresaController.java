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

import com.bd.eventos.entities.Empresa;
import com.bd.eventos.services.EmpresaService;

@RestController
@RequestMapping("empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService service;

    @GetMapping()
    public List<Empresa> listarEmpresas() {
        return service.listarEmpresas();
    }

    @GetMapping("{id}")
    public Empresa listarEmpresaPorId(@PathVariable Long id) {
        return service.listarEmpresaPorId(id);
    }
    
    @PostMapping()
    public Empresa criarEmpresa(@RequestBody Empresa empresa) {
        return service.criarEmpresa(empresa);
    }
    
    @PutMapping()
    public Empresa atualizarEmpresa(@RequestBody Empresa empresa) {
        return service.criarEmpresa(empresa);
    }

    @DeleteMapping("{id}")
    public void deleteEmpresa(@PathVariable Long id) {
        try {
            service.deletarEmpresa(id);
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
        }
    }
}
