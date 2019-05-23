package com.protese.rest.model.business;

import com.protese.rest.model.common.BaseEntity;
import com.protese.rest.model.common.util.DateTimeUtil;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="pessoa")
public class Pessoa extends BaseEntity {

    @NotNull
    private String cpf;
    @NotNull
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = DateTimeUtil.DATE_TIME_FORMAT_NORMAL)
    private Calendar dataNascimento;

    @OneToMany
    @JoinTable(name="pessoacontato",
    joinColumns = @JoinColumn(name = "pessoaid",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="contatoid",referencedColumnName = "id"))
    private List<Contato> contatos;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
