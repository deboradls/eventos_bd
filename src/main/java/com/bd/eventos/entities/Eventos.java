package com.bd.eventos.entities;

import java.time.LocalDate;
import java.util.List;

import com.bd.eventos.commons.StatusEventoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "id_organizador")
    Organizador organizador;

    @Column
    LocalDate dataEvento;

    @Column(length = 512)
    String descricao;

    @Column(length = 64)
    String nome;

    @Column(length = 64)
    String local;

    @Column(length = 32)
    String duracao;

    @Enumerated(EnumType.ORDINAL)
    StatusEventoEnum status;

    @ManyToMany
    @JoinTable(name = "atividade_eventos")
    List<Atividade> atividades;
}
