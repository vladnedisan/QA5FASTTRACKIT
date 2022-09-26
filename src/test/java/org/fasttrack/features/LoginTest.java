package org.fasttrack.features;


import org.fasttrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(Constants.USER_NAME);
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASS + "a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedInPassword();
    }

    @Test
    public void loginWithInvalidEmaildTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL + "a");
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedInEMAIL();
    }

    @Test
    public void lostPasswordValidEmailTest() {
        loginSteps.navigateToAccountPage();
        loginSteps.clickLostPassword();
        loginSteps.setLostPasswordField(Constants.LOSTUSER_EMAIL);
        loginSteps.clickResetPassword();
        loginSteps.verifyResetEmailIsSent();
    }

    @Test
    public void lostPasswordInvalidEmailTest() {
        loginSteps.navigateToAccountPage();
        loginSteps.clickLostPassword();
        loginSteps.setLostPasswordField(Constants.LOSTUSER_EMAIL + "a");
        loginSteps.clickResetPassword();
        loginSteps.verifyErrorMessageInvalidUsernameOrEmail();
    }

    @Test
    public void checkRememberMeBoxTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickCheckRememberMeCheckBox();
        loginSteps.clickLogin();
        loginSteps.navigateToLoginPage();
    }

    @Test
    public void loginWithValidCredentialsAsAdminTest() {
        driver.get(Constants.ADMIN_BASE_URL);
        loginSteps.setAdminUsername(Constants.ADMINUSER_NAME);
        loginSteps.setAdminPassword(Constants.ADMINUSER_PASS);
        loginSteps.clickAdminLogin();
        loginSteps.assertWPLogoutlinkIsDisplayed();
    }
}