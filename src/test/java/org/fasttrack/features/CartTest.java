package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie");
        cartSteps.addProductToCart();
        cartSteps.checkCart();
    }

    @Test
    public void removeProductFromCartTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie");
        cartSteps.addProductToCart();
        cartSteps.checkCart();
        cartSteps.removeProductFromCart();
        cartSteps.verifyCartIsEmptyMessage();
    }

    @Test
    public void increaseQuantityInCartListTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie");
        cartSteps.addProductToCart();
        cartSteps.checkCart();
        cartSteps.increaseQuantityInCart();
    }

    @Test
    public void decreaseQuantityInCartListTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie");
        cartSteps.addProductToCart();
        cartSteps.checkCart();
        cartSteps.decreaseQuantityInCart();
    }

    @Test
    public void updateCartAfterDecreaseQuantityInCartListTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie");
        cartSteps.addProductToCart();
        cartSteps.checkCart();
        cartSteps.decreaseQuantityInCart();
        cartSteps.updateCart();
    }


    //  @Test
    //  public void checkTotalAndSubtotalTest() {
    //      searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
    //      cartSteps.addProductToCart();
    //      cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");
    //      cartSteps.checkSubtotalPrice();
    //      cartSteps.checkTotalPrice();
    //  }
}
