package com.protese.rest.model.business;

import com.protese.rest.model.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "contato")
public class Contato extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private TipoContato tipoContato;
    @OneToOne
    @JoinColumn(name="telefoneid",referencedColumnName = "id",nullable = true)
    private Telefone telefone;
    @OneToOne
    @JoinColumn(name = "emailid",referencedColumnName = "id",nullable = true)
    private Email email;

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
