package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void validCheckoutTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.AddProductToCartBeanieWithLogo();
        cartSteps.checkCart();
        cartSteps.clickProceedToCheckoutButton();
        checkoutSteps.clickPlaceOrderButton();


    }
}
