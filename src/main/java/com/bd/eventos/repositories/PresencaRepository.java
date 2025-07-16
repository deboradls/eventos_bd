package com.bd.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.eventos.entities.Presenca;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long>{
    
}
