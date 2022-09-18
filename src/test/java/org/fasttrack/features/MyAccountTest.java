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
}
