package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {

    @Step
    public void setRegisterUserEmail(String email) {
        accountPage.setEmailRegisterField(email);
    }

    @Step
    public void setRegisterPassword(String pass) {
        accountPage.setPasswordRegisterField(pass);
    }

    @Step
    public void clickOnRegisterButton() {
        accountPage.clickRegisterButton();
    }

    @Step
    public void assertMissingEmailRegistration() {
        Assert.assertNotNull(accountPage.getMissingEmailAddressText());
    }

    @Step
    public void assertInvalidPasswordRegistration() {
        Assert.assertNotNull(accountPage.getWeakPasswordText());
    }

    @Step
    public void assertValidRegistration() {
        accountPage.getLogoutLink();
    }

    @Step
    public void assertAlreadyUsedEmailRegistration() {
        accountPage.getAlreadyRegisteredEmailAddressText();
    }
}
