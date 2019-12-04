package com.nasrol.sessionplanner.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.nasrol.sessionplanner.entity.Session;

@UiController("sessionplanner_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}