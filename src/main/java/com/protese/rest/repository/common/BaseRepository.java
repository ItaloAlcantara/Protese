package com.protese.rest.repository.common;

import com.protese.rest.model.common.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository  <ENTITY extends BaseEntity> extends JpaRepository<ENTITY,Long> {
}
