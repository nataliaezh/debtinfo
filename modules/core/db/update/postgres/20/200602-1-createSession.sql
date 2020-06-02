create table DEBTINFO_SESSION (
    ID bigint,
    UUID uuid,
    --
    DATE_ date,
    DEBTOR_ID bigint not null,
    LETTER_ID bigint not null,
    COMMENTS varchar(255),
    --
    primary key (ID)
);