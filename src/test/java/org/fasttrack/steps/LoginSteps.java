package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
     //   homePage.clickAccountLink();
        homePage.clickLoginLink();
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
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals(userName, accountPage.getWelcomeText());
    }

    @Step
    public void verifyUserNotLoggedIn(){
        Assert.assertEquals("Invalid login or password.",loginPage.getErrorMessage());
    }

    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        setUserEmail(email);
        setPassword(pass);
        clickLogin();
    }
}
