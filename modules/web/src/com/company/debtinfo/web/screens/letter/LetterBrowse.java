package com.company.debtinfo.web.screens.letter;

import com.haulmont.cuba.gui.screen.*;
import com.company.debtinfo.entity.Letter;

@UiController("debtinfo_Letter.browse")
@UiDescriptor("letter-browse.xml")
@LookupComponent("lettersTable")
@LoadDataBeforeShow
public class LetterBrowse extends StandardLookup<Letter> {
}