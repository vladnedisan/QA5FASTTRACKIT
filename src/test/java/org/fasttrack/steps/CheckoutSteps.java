package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.clickPlaceOrdertButton();
    }
}