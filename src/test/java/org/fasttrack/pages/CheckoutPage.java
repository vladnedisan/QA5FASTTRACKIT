package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage {


    @FindBy(css = "#place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = "#order_review > table > tfoot > tr.cart-discount.coupon-percentage25 > td > a")
    private WebElementFacade removeCouponButton;

    @FindBy(css = "#post-6 > div > div > div > div > div")
    private WebElementFacade removedAppliedCouponText;

    public void clickPlaceOrdertButton() {
        clickOn(placeOrderButton);
    }

    public void clickRemoveCouponButton() {
        clickOn(removeCouponButton);
        waitABit(3000);
    }

    public String checkRemovedAppliedCouponText() {
        return removedAppliedCouponText.getText();
    }
}

