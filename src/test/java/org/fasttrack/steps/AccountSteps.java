package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
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

}
