package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;


public class CartPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;

    @FindBy( css ="#post-5 > div > div > div > div > form > table > tbody > tr:nth-child(1) > td.product-remove > a")
    private WebElementFacade deleteProduct;

    @FindBy (css = "#post-5 > div > div > div > div.woocommerce > p.cart-empty")
    private WebElementFacade  cartIsEmptyMessage;

    @FindBy ( id = "quantity_63222d1063b87")
    private WebElementFacade productQuantityTextField;

    @FindBy ( css = "[class='woocommerce-cart-form__cart-item cart_item']:nth-child(1) [class='input-text qty text']")
    private WebElementFacade quantityValue;

    @FindBy(css = ".product-cart-total")
    private List<WebElementFacade> subtotalProductList;

    @FindBy(css = "tbody tr:first-child .a-right .price")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = "tbody tr:last-child .a-right .price")
    private WebElementFacade taxPrice;

    @FindBy(css = "tfoot .price")
    private WebElementFacade totalCartPrice;

    public String checkSuccessMessage() {
        return successMessage.getText();
    }
    public void clickDeleteProduct(){
        clickOn(deleteProduct);
    }
    public String checkCartIsEmptyMessage() {
        return cartIsEmptyMessage.getText();
    }
    public void increaseProductQuantity(){
        changeProductQuantity(1);
    }

    public void decreaseProductQuantity () {
        changeProductQuantity(-1);
    }

    public void changeProductQuantity (int value) {
        String productQuantityValue = quantityValue.getAttribute("value");
        int productQuantityValueInt = Integer.parseInt(productQuantityValue);
        int changeProductQuantityValue = productQuantityValueInt + value;
        String productQuantityIncreased = Integer.toString(changeProductQuantityValue);
        quantityValue.clear();
        quantityValue.sendKeys(productQuantityIncreased);
        quantityValue.getAttribute("value");
        Assert.assertEquals(quantityValue.getAttribute("value"), productQuantityIncreased);
    }

//    public void enterProductQuantity(String val) {
//        quantityValue.clear();
//        quantityValue.sendKeys(val);
//        quantityValue.getAttribute("value");
//        Assert.assertEquals(quantityValue.getAttribute("value"), val);
//    }

    public void enterProductQuantity(String val) {
        quantityValue.clear();
        quantityValue.sendKeys(val);
        quantityValue.getAttribute("value");
        Assert.assertEquals(quantityValue.getAttribute("value"), val);
    }

    public int getProductsSubtotal() {
        int sum = 0;
        for (WebElementFacade elementFacade : subtotalProductList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }

    public boolean checkIfSubtotalMatches() {
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }

    public boolean checkIfTotalPriceMatches() {
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }
}
