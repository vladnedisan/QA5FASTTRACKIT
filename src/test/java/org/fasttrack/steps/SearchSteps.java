package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void searchForKeyword(String keyword) {
        homePage.setSearchField(keyword);
        homePage.clickSearchButton();
    }
    @Step
    public void assertSearchResultText(String value){
        Assert.assertEquals(value,searchResultsPage.getSearchResultsText());
    }

    @Step
    public void assertSearchFieldIsDisplayed(){
        Assert.assertTrue(homePage.searchFieldIsDisplayed());
    }
    @Step
    public void assertSearchButtonIsClickable(){
        Assert.assertTrue(homePage.searchButtonIsClickable());
    }
    @Step
    public void searchResultsTitleTextIsRelevantToSearchKeyword(String value){
        searchResultsPage.getSearchResultsTitleText().contains(value);
    }
    @Step
    public void assertSearchResultsTitleTextIsRelevantToSearchKeyword(String productName){
        Assert.assertTrue(searchResultsPage.findProductInGrid(productName));
    }
    @Step
    public void navigateToProductName(String productName) {
        searchForKeyword(productName);

    }



}
