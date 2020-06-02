package com.company.debtinfo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import java.util.UUID;

@NamePattern("%s %s|title,content")
@Table(name = "DEBTINFO_LETTER")
@Entity(name = "debtinfo_Letter")
public class Letter extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = 5449657547262314127L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "CONTENT")
    protected String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}