package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.clickPlaceOrdertButton();
    }
    @Step
    public void clickRemoveCouponButton(){
        checkoutPage.clickRemoveCouponButton();
    }
    @Step
    public void verifyTextOfValidCouponRemovedText() {
        Assert.assertEquals("Coupon has been removed.", checkoutPage.checkRemovedAppliedCouponText());
    }
}