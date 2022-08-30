package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
    }
    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");

        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }
}
