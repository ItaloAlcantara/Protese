package com.protese.rest.model.business;

import com.protese.rest.model.common.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="empresa",schema = "busness")
public class Empresa extends BaseEntity {

    @NotNull
    private String cnpj;

    @NotNull
    private String razaoSocial;

    @NotNull
    private String nomeFantasia;
    @OneToMany
    @JoinTable(name = "empresacontato",schema = "busness",
    joinColumns = @JoinColumn(name = "empresaid",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn (name = "contatoid",referencedColumnName = "id"))
    private List<Contato> contatos;


}
