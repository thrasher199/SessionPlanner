package com.nasrol.sessionplanner.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.nasrol.sessionplanner.entity.Speaker;

@UiController("sessionplanner_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}