package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;

public class  BasePage extends PageObject {
    public int convertStringToInteger(String value) {
        return Integer.parseInt(value
                .replaceAll(" RON", "")
                .replaceAll(",", ""));
    }

}
