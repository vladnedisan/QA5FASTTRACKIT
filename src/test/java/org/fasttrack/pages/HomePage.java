package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.fasttrack.utils.Constants;

@DefaultUrl(Constants.BASE_URL)
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.login-woocommerce > a")
    private WebElementFacade loginLink;

    @FindBy( id = "search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
}
