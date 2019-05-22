package com.protese.rest.model.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.protese.rest.model.common.deserialize.FormatDateTimeZoneDeserialize;
import com.protese.rest.model.common.serialize.FormatDateTimeZoneSerialize;
import com.protese.rest.model.common.util.DateTimeUtil;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity extends ProteseEntity {
    @Id
    @Column(name="id",unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id")
    private Long id;

    @Column(updatable = false)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false,updatable = false)
    private Calendar inclusion;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = FormatDateTimeZoneSerialize.class)
    @JsonDeserialize(using = FormatDateTimeZoneDeserialize.class)
    @Column(insertable = false)
    private Calendar edition;

    private Calendar exclusion;
    private Long status =0L;

    public static String UUID(){
        return UUID.randomUUID().toString();
    }
    @PrePersist
    public void setInclusion(){
        uuid=UUID();
        inclusion= DateTimeUtil.dateUTC();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @PreUpdate
    public void setEdicao() {
        edition = DateTimeUtil.dateUTC();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Calendar getInclusion() {
        return inclusion;
    }

    public void setInclusion(Calendar inclusion) {
        this.inclusion = inclusion;
    }

    public Calendar getEdition() {
        return edition;
    }

    public void setEdition(Calendar edition) {
        this.edition = edition;
    }

    public Calendar getExclusion() {
        return exclusion;
    }

    public void setExclusion(Calendar exclusion) {
        this.exclusion = exclusion;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
