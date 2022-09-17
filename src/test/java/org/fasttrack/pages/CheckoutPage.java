package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage{


    @FindBy (css ="#place_order")
    private WebElementFacade placeOrderButton;

    public void clickPlaceOrdertButton() {
        clickOn(placeOrderButton);
    }
}
