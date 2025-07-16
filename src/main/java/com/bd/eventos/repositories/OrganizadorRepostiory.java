package com.bd.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.eventos.entities.Organizador;

@Repository
public interface OrganizadorRepostiory extends JpaRepository<Organizador, Long>{
    
}
