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

    @FindBy(css = "#post-7 > div > div > div > div > form > p:nth-child(4) > button")
    private WebElementFacade resetButton;

    @FindBy(id = "reg_email")
    private WebElementFacade emailRegisterField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordRegisterField;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")
    private WebElementFacade registerButton;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > div")
    private WebElementFacade weakPasswordText;
    @FindBy(css = "#post-7 > div > div > div > div > ul > li")
    private WebElementFacade missingEmailAddressText;
    @FindBy(css = "#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.login-woocommerce > a")
    private WebElementFacade logoutLink;
    @FindBy(css = "#post-7 > div > div > div > div > ul > li")
    private WebElementFacade alreadyRegisteredEmailAddressText;

    @FindBy(id = "rememberme")
    private WebElementFacade rememberMeCheckBox;
    @FindBy(css = "#post-7 > div > div > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-account")
    private WebElementFacade accountDetailsButton;
    @FindBy(id = "password_current")
    private WebElementFacade currentPasswordField;
    @FindBy(id = "password_1")
    private WebElementFacade newPasswordField;
    @FindBy(id = "password_2")
    private WebElementFacade confirmNewPasswordField;
    @FindBy(css = "#post-7 > div > div > div > div > div.woocommerce-message")
    private WebElementFacade accountDetailsChangedSuccessMessage;
    @FindBy(css = "#post-7 > div > div > div > div > div > form > p:nth-child(7) > button")
    private WebElementFacade saveAccountDetailsButton;
    @FindBy(css = "#post-7 > div > div > div > div > ul > li")
    private WebElementFacade currentPasswordIsIncorrect;

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void clickLostPasswordButton() {
        clickOn(lostPasswordButton);
    }

    public void clickResetButton() {
        clickOn(resetButton);
    }

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }

    public void setUsernameField(String value) {
        typeInto(usernameField, value);
    }

    public void setLostPasswordTextField(String value) {
        typeInto(lostPasswordTextField, value);
    }

    public void setEmailRegisterField(String value) {
        typeInto(emailRegisterField, value);
    }

    public void setPasswordRegisterField(String value) {
        typeInto(passwordRegisterField, value);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public String getWeakPasswordText() {
        return weakPasswordText.getText();
    }

    public String getMissingEmailAddressText() {
        return missingEmailAddressText.getText();
    }

    public void getLogoutLink() {
        shouldBeVisible(logoutLink);
    }

    public void clickLogoutLink() {
        clickOn(logoutLink);
    }

    public void getAlreadyRegisteredEmailAddressText() {
        shouldBeVisible(alreadyRegisteredEmailAddressText);
    }

    public void setRememberMeCheckBox() {
        setCheckbox(rememberMeCheckBox, true);
    }

    public void clickAccountDetailsButton() {
        clickOn(accountDetailsButton);
    }

    public void setCurrentPasswordField(String value) {
        typeInto(currentPasswordField, value);
    }

    public void setNewPasswordField(String value) {
        typeInto(newPasswordField, value);
    }

    public void setConfirmNewPasswordField(String value) {
        typeInto(confirmNewPasswordField, value);
    }
    public String getAccountDetailsChangedSuccessMessage(){
        return accountDetailsChangedSuccessMessage.getText();
    }
    public boolean assertAccountDetailsChangedSuccessMessage(){
        return accountDetailsChangedSuccessMessage.isDisplayed();
    }
    public void clickSaveAccountDetailsButton() {
        clickOn(saveAccountDetailsButton);
    }
    public String getCurrentPasswordIsIncorrect() {
        return currentPasswordIsIncorrect.getText();
    }

}
