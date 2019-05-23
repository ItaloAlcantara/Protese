package com.protese.rest.controller.business;

import com.protese.rest.controller.common.BaseController;
import com.protese.rest.controller.common.EndPoints;
import com.protese.rest.model.business.Telefone;

import com.protese.rest.service.business.TelefoneService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = EndPoints.Business.BUSINESS)
public class TelefoneController extends BaseController <Telefone,TelefoneService>{

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public ResponseEntity<List<Telefone>> findAllTelefone(){
        List<Telefone> telefones   = (List<Telefone>) service.findAll();
        return new ResponseEntity<List<Telefone>>(telefones,HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public ResponseEntity insert(Telefone telefone){
        service.insert(telefone);
        return new ResponseEntity(HttpStatus.OK);
    }
}
