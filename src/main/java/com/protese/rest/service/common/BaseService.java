package com.protese.rest.service.common;

import com.protese.rest.model.common.BaseEntity;
import com.protese.rest.repository.common.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BaseService <ENTITY extends BaseEntity,REPOSITORY extends BaseRepository<ENTITY>>{

    @Autowired
    protected REPOSITORY repository;

    public List<ENTITY> findAll(){
        return repository.findAll();
    }

    public ResponseEntity insert(ENTITY entity){
        return repository.save(entity);
    }
}
