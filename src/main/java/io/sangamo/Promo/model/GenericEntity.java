package io.sangamo.Promo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

@Entity
public class GenericEntity {
    @Column(name = "create_date", updatable = false)
    Date createDate;

    @Column(name = "update_date")
    Date updateDate;

    @PrePersist
    void setCreateDate(){
        this.createDate = this.updateDate = new Date();
    }

    @PreUpdate
    void setUpdateDate(){
        this.updateDate = new Date();
    }

}
