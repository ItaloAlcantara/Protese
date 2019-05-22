package com.protese.rest.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProteseEntity implements Serializable {
}
