package com.company.debtinfo.web.screens.debtor;

import com.haulmont.cuba.gui.screen.*;
import com.company.debtinfo.entity.Debtor;

@UiController("debtinfo_Debtor.browse")
@UiDescriptor("debtor-browse.xml")
@LookupComponent("debtorsTable")
@LoadDataBeforeShow
public class DebtorBrowse extends StandardLookup<Debtor> {
}