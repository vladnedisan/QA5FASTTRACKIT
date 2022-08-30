package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;


public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons button")
    private WebElement addToCartButton;

    public void clickAddToCart (){
        clickOn(addToCartButton);
    }

}
