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

    @Test
    public void updateCartAfterIncreaseQuantityInCartListTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie");
        cartSteps.addProductToCart();
        cartSteps.checkCart();
        cartSteps.increaseQuantityInCart();
        cartSteps.updateCart();
    }

    @Test
    public void removeAllItemsFromCartAndCheckCartIfItIsEmptyTest() throws InterruptedException {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
       // searchSteps.navigateToProductName("Beanie");
       // cartSteps.addProductToCart();
        System.out.println(1);
        cartSteps.checkCart();
        System.out.println(2);
        cartSteps.emptyCart();
        System.out.println(3);
        cartSteps.verifyCartIsEmptyMessage();
    }

    @Test
    public void checkSuccessMessageIsDisplayedWhenAProductIsAddedToCartTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.AddProductToCartBeanieWithLogo();
        cartSteps.verifyAddToCartMessageIsDisplayed();
    }

    @Test
    public void clickOnProceedToCheckOutButtonTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.AddProductToCartBeanieWithLogo();
        cartSteps.checkCart();
        cartSteps.clickProceedToCheckoutButton();
    }

    @Test
    public void applyInvalidCouponTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.AddProductToCartBeanieWithLogo();
        cartSteps.checkCart();
        cartSteps.applyInvalidCoupon();
        cartSteps.clickApplyCoupon();
        cartSteps.verifyTextOfInvalidCouponAppliedTest();
    }

    @Test
    public void applyValidCouponTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.AddProductToCartBeanieWithLogo();
        cartSteps.checkCart();
        cartSteps.applyValidCoupon();
        cartSteps.clickApplyCoupon();
        cartSteps.verifyTextOfValidCouponAllpiedTest();
    }

    @Test
    public void reapplyValidCouponTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.AddProductToCartBeanieWithLogo();
        cartSteps.checkCart();
        cartSteps.applyValidCoupon();
        cartSteps.clickApplyCoupon();
        cartSteps.verifyTextOfValidCouponReappliedTest();
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
