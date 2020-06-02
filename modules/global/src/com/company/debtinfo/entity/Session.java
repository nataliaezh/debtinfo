package com.company.debtinfo.entity;

import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Table(name = "DEBTINFO_SESSION")
@Entity(name = "debtinfo_Session")
public class Session extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = 8981160694354698288L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "DATE_")
    protected LocalDate date;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DEBTOR_ID")
    protected Debtor debtor;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LETTER_ID")
    protected Letter letter;

    @Column(name = "COMMENTS")
    protected String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}