-- begin DEBTINFO_DEBTOR
create table DEBTINFO_DEBTOR (
    ID bigint,
    UUID uuid,
    --
    FIRSTNAME varchar(255),
    LASTNAME varchar(255),
    SUMDEBT double precision,
    --
    primary key (ID)
)^
-- end DEBTINFO_DEBTOR
-- begin DEBTINFO_LETTER
create table DEBTINFO_LETTER (
    ID bigint,
    UUID uuid,
    --
    TITLE varchar(255),
    CONTENT varchar(255),
    --
    primary key (ID)
)^
-- end DEBTINFO_LETTER
-- begin DEBTINFO_SESSION
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
)^
-- end DEBTINFO_SESSION
