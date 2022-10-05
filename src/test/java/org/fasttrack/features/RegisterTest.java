package org.fasttrack.features;

import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void registerWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail("a"+"abcd@test.ro");
        registerSteps.setRegisterPassword("1qaz@WSX3edc");
        registerSteps.clickOnRegisterButton();
        registerSteps.assertValidRegistration();
    }

    @Test
    public void registerWithMissingEmailTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail("");
        registerSteps.setRegisterPassword("1qaz@WSX3edc");
        registerSteps.clickOnRegisterButton();
        registerSteps.assertMissingEmailRegistration();
    }

    @Test
    public void registerWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail("abc@test.ro");
        registerSteps.setRegisterPassword("1");
        registerSteps.assertInvalidPasswordRegistration();
    }

    @Test
    public void registerWithAlreadyUsedEmailTest() {
        loginSteps.navigateToLoginPage();
        registerSteps.setRegisterUserEmail("abc@test.ro");
        registerSteps.setRegisterPassword("1qaz@WSX3edc");
        registerSteps.clickOnRegisterButton();
        registerSteps.assertAlreadyUsedEmailRegistration();
    }

    @Test
    public void registerWithInvalidEmailTest() {
        //cannot access element for invalid email -> browser generated
    }
}
