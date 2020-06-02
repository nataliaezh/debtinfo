package com.company.debtinfo.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Table(name = "DEBTINFO_DEBTOR")
@Entity(name = "debtinfo_Debtor")
@NamePattern("%s %s %s|firstname,lastname,sumdebt")
public class Debtor extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = -1132787181604540193L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "FIRSTNAME")
    protected String firstname;

    @Column(name = "LASTNAME")
    protected String lastname;

    @Column(name = "SUMDEBT")
    protected Double sumdebt;

    public Double getSumdebt() {
        return sumdebt;
    }

    public void setSumdebt(Double sumdebt) {
        this.sumdebt = sumdebt;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}