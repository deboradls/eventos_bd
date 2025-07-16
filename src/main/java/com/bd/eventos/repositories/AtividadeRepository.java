package com.bd.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.eventos.entities.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{
    
}
