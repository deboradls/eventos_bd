package com.bd.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.eventos.entities.Eventos;

@Repository
public interface EventosRepository extends JpaRepository<Eventos, Long>{
    
}
