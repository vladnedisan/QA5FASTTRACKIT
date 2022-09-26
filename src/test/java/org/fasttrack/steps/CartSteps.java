package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void addProductToCart() {

        productPage.clickAddToCart();

    }

    @Step
    public void AddProductToCartBeanieWithLogo() {
        productPage.clickAddToCartBeanieWithLogo();

    }

    @Step
    public void clickProceedToCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @Step
    public void applyInvalidCoupon() {
        cartPage.enterInvalidCouponInTextField();
    }

    @Step
    public void applyValidCoupon() {
        cartPage.enterValidCouponInTextField();
    }

    @Step
    public void clickApplyCoupon() {
        cartPage.clickApplyCouponButton();
        waitABit(3000);
    }

    @Step
    public void checkCart() {
        homePage.clickMyCartButton();
        waitABit(3000);
    }

    @Step
    public void removeProductFromCart() {
        cartPage.clickDeleteProduct();
        waitABit(3000);
    }

    @Step
    public void verifyCartIsEmptyMessage() {
        Assert.assertEquals("Your cart is currently empty.", cartPage.checkCartIsEmptyMessage());
    }

    @Step
    public void verifyAddToCartMessageIsDisplayed() {
        Assert.assertEquals("View cart" + '\n' + "“Beanie with Logo” has been added to your cart.", cartPage.checkAddToCartMessage());
    }

    @Step
    public void verifyTextOfInvalidCouponAppliedTest() {
        Assert.assertEquals("Coupon \"percentaje\" does not exist!", cartPage.checkAppliedInvalidCouponText());
    }

    @Step
    public void verifyTextOfValidCouponAllpiedTest() {
        Assert.assertEquals("Coupon code applied successfully.", cartPage.checkAppliedValidCouponText());
    }

    @Step
    public void verifyTextOfValidCouponReappliedTest() {
        Assert.assertEquals("Coupon code already applied!", cartPage.checkReappliedValidCouponText());
    }

    @Step
    public void increaseQuantityInCart() {
        cartPage.increaseProductQuantity();
        waitABit(3000);
    }

    public void decreaseQuantityInCart() {
        cartPage.decreaseProductQuantity();
        waitABit(3000);
    }

    public void updateCart() {
        cartPage.clickUpdateCart();
        waitABit(3000);
    }

    public void emptyCart() {
        cartPage.removeProducts();
    }


}
