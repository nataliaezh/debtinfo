package com.company.debtinfo.web.screens.debtor;

import com.haulmont.cuba.gui.screen.*;
import com.company.debtinfo.entity.Debtor;

@UiController("debtinfo_Debtor.edit")
@UiDescriptor("debtor-edit.xml")
@EditedEntityContainer("debtorDc")
@LoadDataBeforeShow
public class DebtorEdit extends StandardEditor<Debtor> {
}