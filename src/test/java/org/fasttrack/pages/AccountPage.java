package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage {

    @FindBy(css = "#post-7 > div > div > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade welcomeTextElement;
    @FindBy(id = "username")
    private WebElementFacade usernameField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade loginButton;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p.woocommerce-LostPassword.lost_password > a")
    private WebElementFacade lostPasswordButton;

    @FindBy(css = "#user_login")
    private WebElementFacade lostPasswordTextField;

    @FindBy (css = "#post-7 > div > div > div > div > form > p:nth-child(4) > button")
    private WebElementFacade resetButton;


    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void clickLostPasswordButton() {
        clickOn(lostPasswordButton);
    }
    public void clickResetButton(){
        clickOn(resetButton);
    }

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }
    public void setUsernameField(String value) {
        typeInto(usernameField, value);
    }
    public void setLostPasswordTextField( String value) {
        typeInto(lostPasswordTextField, value);
    }

}
