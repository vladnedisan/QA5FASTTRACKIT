package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;


public class  ProductPage extends BasePage {

    @FindBy(css = "#primary > div > div.wc-products > ul > li.post-43.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories.first.instock.sale.shipping-taxable.purchasable.product-type-simple > div.collection_desc.clearfix > div > a")
    private WebElement addToCartButton;

    public void clickAddToCart() {
        clickOn(addToCartButton);
    }

}
