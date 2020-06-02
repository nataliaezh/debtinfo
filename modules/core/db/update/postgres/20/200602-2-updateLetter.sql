alter table DEBTINFO_LETTER rename column debtor_id to debtor_id__u36404 ;
alter table DEBTINFO_LETTER drop constraint FK_DEBTINFO_LETTER_ON_DEBTOR ;
drop index IDX_DEBTINFO_LETTER_ON_DEBTOR ;
