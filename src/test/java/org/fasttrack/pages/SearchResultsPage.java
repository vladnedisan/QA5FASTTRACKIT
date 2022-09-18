package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".category-products .item .product-name a")
    private static List<WebElementFacade> listOfProductNames;

    @FindBy(css = "#title_bread_wrap > div > h1")
    private WebElementFacade searchResultsText;
    @FindBy(css = "#primary > div > div.wc-products > ul > li.post-1064.product.type-product.status-publish.product_cat-uncategorized.product_tag-produs-nou.first.instock.sale.shipping-taxable.purchasable.product-type-simple > div.collection_desc.clearfix > a")
    private WebElementFacade searchResultsTitleText;

    public Object getSearchResultsText (){
        return searchResultsText.getText();
    }
    public String getSearchResultsTitleText(){
        return searchResultsTitleText.getText();
    }

    public static boolean findProductInGridAndOpen(String productName) {
        for (WebElementFacade element : listOfProductNames) {
            if (element.getText().equalsIgnoreCase(productName)) {
                element.click();
                return true;
            }
        }
        return false;
    }
}
