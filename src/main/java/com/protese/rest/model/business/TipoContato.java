package com.protese.rest.model.business;

public enum  TipoContato {

        EMPRESARIAL("Empresarial"),
        COMERCIAL("Comercial"),
        RESIDENCIAL("Residencial"),
        OUTROS("Outros");

        private final String descricao;
        TipoContato(String descricao) {
            this.descricao = descricao;
        }

    public String getDescricao(){
            return descricao;
    }
}
