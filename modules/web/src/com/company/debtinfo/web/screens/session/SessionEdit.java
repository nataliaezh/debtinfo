package com.company.debtinfo.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.debtinfo.entity.Session;

@UiController("debtinfo_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}