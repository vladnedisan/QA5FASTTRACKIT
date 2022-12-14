package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.fasttrack.utils.Constants;

@DefaultUrl(Constants.BASE_URL)
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-70 > a")
    private WebElementFacade accountLink;

    @FindBy(css = "#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.login-woocommerce > a")
    private WebElementFacade loginLink;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p.woocommerce-LostPassword.lost_password > a")
    private WebElementFacade lostPassword;

    @FindBy(css = "#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.search-form > form > input.search-field")
    private WebElementFacade searchField;


    @FindBy(css = "#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.search-form > form > button")
    private WebElementFacade searchButton;

    @FindBy(css = "#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.view-cart > a > i")
    private WebElementFacade viewMyCartButton;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void clickLostPassword() {
        clickOn(lostPassword);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value);
    }
    public boolean searchFieldIsDisplayed (){
        return searchField.isDisplayed();
    }
    public boolean searchButtonIsClickable (){
        return searchButton.isClickable();
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void clickMyCartButton() {
        clickOn(viewMyCartButton);
    }
    public boolean loginLinkIsDisplayed(){
        return loginLink.isDisplayed();
    }
}
