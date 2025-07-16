package com.bd.eventos.commons;

public enum StatusEventoEnum {
    CONCLUIDO(0),
    EM_ANDAMENTO(1),
    CANCELADO(2);
    
    private Integer status;

    StatusEventoEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
}
