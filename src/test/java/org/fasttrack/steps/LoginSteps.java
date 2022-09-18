package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.AccountPage;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void navigateToAccountPage() {
        homePage.clickAccountLink();
    }

    @Step
    public void setUserEmail(String email) {
        accountPage.setUsernameField(email);
    }

    @Step
    public void setPassword(String password) {
        accountPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        accountPage.clickLoginButton();
    }
    @Step
    public void clickLogout(){
        accountPage.clickLogoutLink();
    }

    @Step
    public void clickLostPassword() {
        accountPage.clickLostPasswordButton();
    }

    @Step
    public void clickResetPassword() {
        accountPage.clickResetButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals(userName, accountPage.getWelcomeText());
    }

    @Step
    public void setLostPasswordField(String value) {
        accountPage.setLostPasswordTextField(value);
    }
    @Step
    public void setAdminUsername(String value){
        loginPage.setAdminUserField(value);
    }
    @Step
    public void setAdminPassword(String value){
        loginPage.setAdminPassField(value);
    }
    @Step
    public void clickAdminLogin(){
        loginPage.clickAdminLoginButton();
    }
    @Step
    public void assertWPLogoutlinkIsDisplayed(){
        Assert.assertTrue(wpHomePage.wpLogoutlinkIsDisplayed());
    }
    @Step
    public void assertLoginlinkIsDisplayed(){
        Assert.assertTrue(homePage.loginLinkIsDisplayed());
    }

    @Step
    public void verifyUserNotLoggedInPassword() {
        Assert.assertEquals("ERROR: The password you entered for the email address test_register@test.ro is incorrect. Lost your password?", loginPage.getErrorMessage());
    }

    @Step
    public void verifyUserNotLoggedInEMAIL() {
        Assert.assertEquals("ERROR: Invalid email address. Lost your password?", loginPage.getErrorMessage());
    }

    @Step
    public void verifyResetEmailIsSent() {
        Assert.assertEquals("Password reset email has been sent.", loginPage.getNotificationMessage());
    }

    @Step
    public void clickCheckRememberMeCheckBox() {
        accountPage.setRememberMeCheckBox();

    }

    @Step
    public void verifyErrorMessageInvalidUsernameOrEmail() {
        Assert.assertEquals("Invalid username or email.", loginPage.getNotificationMessageInvalidUsernameOrEmail());
    }


    @Step
    public void doLogin(String email, String pass) {
        navigateToLoginPage();
        setUserEmail(email);
        setPassword(pass);
        clickLogin();
    }


}
