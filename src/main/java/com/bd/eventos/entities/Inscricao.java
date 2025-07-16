package com.bd.eventos.entities;

import java.time.LocalDate;

import com.bd.eventos.commons.StatusInscricaoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    Eventos eventos;

    @Column
    LocalDate data;

    @Enumerated(EnumType.ORDINAL)
    StatusInscricaoEnum statusInscricao;
}
