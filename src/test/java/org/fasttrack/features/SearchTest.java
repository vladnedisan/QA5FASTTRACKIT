package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest {


    @Test
    public void loginAndSearchForProductNameTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("a");
        searchSteps.findProductWithNameInListAndOpen("a");

    }

    @Test
    public void loginAndSearchForSecondProductNameTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("FRENCH CUFF COTTON TWILL OXFORD");

    }
}
