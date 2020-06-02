package com.company.debtinfo.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.debtinfo.entity.Session;

@UiController("debtinfo_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}