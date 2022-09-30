package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class MyAccountTest extends BaseTest{

    @Test
    public void logOutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.clickLogout();
        loginSteps.assertLoginlinkIsDisplayed();
    }

    @Test
    public void changePasswordTest(){
        String newPassword = "1qaz@WSX3edc$RFV3";
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        accountSteps.clickAccountDetailsButton();
        accountSteps.setCurrentPasswordField(Constants.USER_PASS);
        accountSteps.setNewPasswordField(newPassword);
        accountSteps.setConfirmNewPasswordField(newPassword);
        accountSteps.clickSaveAccountDetailsButton();
        accountSteps.assertAccountDetailsChangedSuccessMessage();
    }
}
