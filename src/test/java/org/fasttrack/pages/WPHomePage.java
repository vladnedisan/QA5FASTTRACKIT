package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WPHomePage extends PageObject {

    @FindBy (id = "wp-admin-bar-logout")
    private WebElementFacade wpLogoutLink;
    @FindBy (css = "#wp-admin-bar-my-account > a")
    private WebElementFacade adminAccountDropDown;

    public void getWpLogoutLink(){
        wpLogoutLink.getText();
    }
    public boolean wpLogoutlinkIsDisplayed (){
        return adminAccountDropDown.isDisplayed();
    }

}
