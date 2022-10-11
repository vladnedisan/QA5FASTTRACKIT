package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void registerWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail("c"+ Constants.USER_EMAIL1);
        registerSteps.setRegisterPassword(Constants.USER_PASS2);
        registerSteps.clickOnRegisterButton();
        registerSteps.assertValidRegistration();
    }

    @Test
    public void registerWithMissingEmailTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail("");
        registerSteps.setRegisterPassword(Constants.USER_PASS2);
        registerSteps.clickOnRegisterButton();
        registerSteps.assertMissingEmailRegistration();
    }

    @Test
    public void registerWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail(Constants.USER_EMAIL1);
        registerSteps.setRegisterPassword("1");
        registerSteps.assertInvalidPasswordRegistration();
    }

    @Test
    public void registerWithAlreadyUsedEmailTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail(Constants.USER_EMAIL1);
        registerSteps.setRegisterPassword(Constants.USER_PASS2);
        registerSteps.clickOnRegisterButton();
        registerSteps.assertAlreadyUsedEmailRegistration();
    }

    @Test
    public void registerWithInvalidEmailTest() {
        //cannot access element for invalid email -> browser generated
    }
}
