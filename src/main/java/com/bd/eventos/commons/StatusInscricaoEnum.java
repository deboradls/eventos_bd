package com.bd.eventos.commons;

public enum StatusInscricaoEnum {
    ATIVA(0),
    CANCELADA(1),
    EM_ANALISE(2);

    private Integer status;
    StatusInscricaoEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
}
