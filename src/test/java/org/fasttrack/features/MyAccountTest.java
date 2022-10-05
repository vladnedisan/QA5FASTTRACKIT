package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;
import java.util.*;

public class MyAccountTest extends BaseTest{

    @Test
    public void logOutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.clickLogout();
        loginSteps.assertLoginlinkIsDisplayed();
    }

    @Test
    public void changePasswordTest(){
        String newPassword = "1qaz@WSX3edc$1";
        String currentPassword = newPassword;
        loginSteps.doLogin(Constants.USER_EMAIL1,Constants.USER_PASS1);
        accountSteps.clickAccountDetailsButton();
        accountSteps.setCurrentPasswordField(currentPassword);
        accountSteps.setNewPasswordField(newPassword);
        accountSteps.setConfirmNewPasswordField(newPassword);
        accountSteps.clickSaveAccountDetailsButton();
        accountSteps.assertAccountDetailsChangedSuccessMessage();
        if(currentPassword.equals(newPassword)){
            newPassword.charAt(2);
        }
    }
    @Test
    public void changePasswordWithCurrentPasswordWrongTest() {
        String Password = "1qaz@WSX3edc$1";
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        accountSteps.clickAccountDetailsButton();
        accountSteps.setCurrentPasswordField(Password);
        accountSteps.setNewPasswordField(Password);
        accountSteps.setConfirmNewPasswordField(Password);
        accountSteps.clickSaveAccountDetailsButton();
        accountSteps.assertCurrentPasswordIsIncorrect();
    }
}
