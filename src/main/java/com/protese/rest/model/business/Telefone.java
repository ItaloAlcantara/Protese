package com.protese.rest.model.business;

import com.protese.rest.model.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone extends BaseEntity {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
