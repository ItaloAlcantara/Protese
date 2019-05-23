package com.protese.rest.controller.common;

import com.protese.rest.model.common.BaseEntity;
import com.protese.rest.service.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController <ENTITY extends BaseEntity, SERVICE extends BaseService>{

    @Autowired
    protected SERVICE service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity findAll (){
        return (ResponseEntity) service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity insert(ENTITY entity){ return  service.insert(entity);}
}
