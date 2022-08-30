package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class CartPage extends BasePage{

    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;

    @FindBy(css =".product-cart-total")
    private List<WebElementFacade> subtotalProductList;

    @FindBy(css ="tbody tr:first-child .a-right .price")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css ="tbody tr:last-child .a-right .price")
    private WebElementFacade taxPrice;

    @FindBy(css = "tfoot .price")
    private WebElementFacade totalCartPrice;

    public String checkSuccessMessage (){
       return successMessage.getText();
    }
    public int getProductsSubtotal (){
        int sum = 0;
        for (WebElementFacade elementFacade:subtotalProductList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }

    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }

    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }
}
