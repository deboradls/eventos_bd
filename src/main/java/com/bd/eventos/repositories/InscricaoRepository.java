package com.bd.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.eventos.entities.Inscricao;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long>{
    
}
