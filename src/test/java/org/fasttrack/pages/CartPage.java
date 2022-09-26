package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;


public class CartPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;

    @FindBy(css = "#post-5 > div > div > div > div > form > table > tbody > tr:nth-child(1) > td.product-remove > a")
    private WebElementFacade deleteProduct;

    @FindBy(css = "#post-5 > div > div > div > div.woocommerce > p.cart-empty")
    private WebElementFacade cartIsEmptyMessage;

    @FindBy(css = "#primary > div > div.woocommerce-message")
    private WebElementFacade addToCartMessage;

    @FindBy(id = "quantity_63222d1063b87")
    private WebElementFacade productQuantityTextField;

    @FindBy(css = "[class='woocommerce-cart-form__cart-item cart_item']:nth-child(1) [class='input-text qty text']")
    private WebElementFacade quantityValue;

    @FindBy(css = ".product-cart-total")
    private List<WebElementFacade> subtotalProductList;

    @FindBy(css = "[class='woocommerce-cart-form__cart-item cart_item'] [class='product-remove'] [class='remove']")
    private List<WebElementFacade> removeProductsList;

    @FindBy(css = "tbody tr:first-child .a-right .price")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = "tbody tr:last-child .a-right .price")
    private WebElementFacade taxPrice;

    @FindBy(css = "tfoot .price")
    private WebElementFacade totalCartPrice;

    @FindBy(css = "#post-5 > div > div > div > div > form > table > tbody > tr:nth-child(2) > td > button")
    private WebElementFacade updateCart;

    @FindBy(css = " #post-5 > div > div > div > div > div > div > div > a")
    private WebElementFacade checkOutButton;

    @FindBy(css = "#coupon_code")
    private WebElementFacade couponTextField;

    @FindBy(css = "#post-5 > div > div > div > div > form > table > tbody > tr:nth-child(2) > td > div > input.button")
    private WebElementFacade applyCouponButton;
    @FindBy(css = "#post-5 > div > div > div > div > ul > li")
    private WebElementFacade checkAppliedInvalidCouponText;

    @FindBy(css = "#post-5 > div > div > div > div > div.woocommerce-message")
    private WebElementFacade getCheckAppliedValidCouponText;

    @FindBy(css = "#post-5 > div > div > div > div > ul > li")
    private WebElementFacade getCheckReappliedValidCouponText;

    public String checkReappliedValidCouponText() {
        return getCheckReappliedValidCouponText.getText();
    }

    public void clickCheckoutButton() {
        clickOn(checkOutButton);
    }

    public String checkAppliedValidCouponText() {
        return getCheckAppliedValidCouponText.getText();

    }

    public void clickApplyCouponButton() {
        clickOn(applyCouponButton);
    }

    public void enterInvalidCouponInTextField() {
        couponTextField.sendKeys("percentaje");
    }

    public void enterValidCouponInTextField() {
        couponTextField.sendKeys("percentage25");
    }

    public String checkSuccessMessage() {
        return successMessage.getText();
    }

    public void clickDeleteProduct() {
        clickOn(deleteProduct);
    }

    public String checkCartIsEmptyMessage() {
        return cartIsEmptyMessage.getText();
    }

    public String checkAddToCartMessage() {
        return addToCartMessage.getText();
    }

    public String checkAppliedInvalidCouponText() {
        return checkAppliedInvalidCouponText.getText();
    }

    public void increaseProductQuantity() {
        changeProductQuantity(1);
    }

    public void decreaseProductQuantity() {
        changeProductQuantity(-1);
    }

    public void changeProductQuantity(int value) {
        String productQuantityValue = quantityValue.getAttribute("value");
        int productQuantityValueInt = Integer.parseInt(productQuantityValue);
        int changeProductQuantityValue = productQuantityValueInt + value;
        String productQuantityIncreased = Integer.toString(changeProductQuantityValue);
        quantityValue.clear();
        quantityValue.sendKeys(productQuantityIncreased);
        quantityValue.getAttribute("value");
        Assert.assertEquals(quantityValue.getAttribute("value"), productQuantityIncreased);
    }


    public void enterProductQuantity(String val) {
        quantityValue.clear();
        quantityValue.sendKeys(val);
        quantityValue.getAttribute("value");
        Assert.assertEquals(quantityValue.getAttribute("value"), val);
    }

    public void clickUpdateCart() {
        clickOn(updateCart);
    }

    public void removeProducts() {
        if (removeProductsList.size() > 0) {
            for (int i = 1; i <= removeProductsList.size(); i++) {
                removeProductsList.get(0).click();
            }
        }
    }

}

