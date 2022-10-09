package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.utils.Constants;
import org.junit.Assert;

public class AccountSteps extends BaseSteps {
    @Step
    public void clickAccountDetailsButton(){
        accountPage.clickAccountDetailsButton();
    }
    @Step
    public void clickSaveAccountDetailsButton(){
        accountPage.clickSaveAccountDetailsButton();
    }
    @Step
    public void setCurrentPasswordField(String value){
        accountPage.setCurrentPasswordField(value);
    }
    @Step
    public void setNewPasswordField(String value){
        accountPage.setNewPasswordField(value);
    }
    @Step
    public void setConfirmNewPasswordField(String value){
        accountPage.setConfirmNewPasswordField(value);
    }
    @Step
    public void assertAccountDetailsChangedSuccessMessage(){
        Assert.assertTrue(accountPage.assertAccountDetailsChangedSuccessMessage());
    }
    @Step
    public void assertCurrentPasswordIsIncorrect(){
        String PasswordIsIncorrectMessage = "Your current password is incorrect.";
        Assert.assertEquals(PasswordIsIncorrectMessage.toUpperCase(),accountPage.getCurrentPasswordIsIncorrect().toUpperCase());
    }
    @Step
    public void updatePasswordInConstants (String str){
        Constants.USER_PASS1 = str;
        System.out.println("Password changed to: "+str);
    }

}
