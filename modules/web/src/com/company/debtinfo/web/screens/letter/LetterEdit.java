package com.company.debtinfo.web.screens.letter;

import com.haulmont.cuba.gui.screen.*;
import com.company.debtinfo.entity.Letter;

@UiController("debtinfo_Letter.edit")
@UiDescriptor("letter-edit.xml")
@EditedEntityContainer("letterDc")
@LoadDataBeforeShow
public class LetterEdit extends StandardEditor<Letter> {
}