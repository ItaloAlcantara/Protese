package com.protese.rest.model.business;

import com.protese.rest.model.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "email", schema="business")
public class Email extends BaseEntity {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
