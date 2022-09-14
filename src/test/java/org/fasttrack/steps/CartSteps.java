package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void addProductToCart() {

        productPage.clickAddToCart();

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
    public void increaseQuantityInCart() {
        cartPage.increaseProductQuantity();
        waitABit(3000);
    }

    public void decreaseQuantityInCart() {
        cartPage.decreaseProductQuantity();
        waitABit(3000);
    }

    //@Step
    // public void checkSuccessMessage(String productName) {
    //   Assert.assertEquals((productName + " was added to your shopping cart.").toLowerCase(),
    //      cartPage.checkSuccessMessage().toString().toLowerCase());
    // }

    @Step
    public void checkSubtotalPrice() {
        waitABit(2000);
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }

    @Step
    public void checkTotalPrice() {
        waitABit(2000);
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }
}
