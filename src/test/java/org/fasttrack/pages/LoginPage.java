package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css = "#post-7 > div > div > div > div > ul > li")
    private WebElementFacade errorMessageElement;

    @FindBy(css = "#post-7 > div > div > div > div > div")
    private WebElementFacade resetPasswordEmailIsSent;
    @FindBy(css = "#post-7 > div > div > div > div > ul > li")
    private WebElementFacade notificationResetPasswordInvalidUsernameOrEmail;

    @FindBy(id="user_login")
    private WebElementFacade adminUserField;

    @FindBy(id="user_pass")
    private WebElementFacade adminPassField;
    @FindBy(css="#wp-submit")
    private WebElementFacade adminLoginButton;

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public String getErrorMessage() {
        return errorMessageElement.getText();
    }

    public String getNotificationMessage() {
        return resetPasswordEmailIsSent.getText();
    }

    public String getNotificationMessageInvalidUsernameOrEmail() {
        return notificationResetPasswordInvalidUsernameOrEmail.getText();
    }

    public void setAdminUserField(String value){
        typeInto(adminUserField,value);
    }
    public void setAdminPassField(String value){
        typeInto(adminPassField,value);
    }
    public void clickAdminLoginButton(){
        clickOn(adminLoginButton);
    }

}
