package com.codeninja.models;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;


public class AuditingEntityListener {

    @PrePersist
    void preCreate(AbstractEntity auditable) {
        Instant instant = Instant.now();
        auditable.setCreatedDate(Instant.now());
        auditable.setLastModifiedDate(Instant.now());
    }

    @PreUpdate
    void preUpdate(AbstractEntity auditable) {
        auditable.setLastModifiedDate(Instant.now());
    }
}