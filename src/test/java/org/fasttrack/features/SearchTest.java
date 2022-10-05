package org.fasttrack.features;

import org.apache.commons.lang3.StringUtils;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchFieldIsDisplayedAndSearchButtonIsClickableTest() {
        searchSteps.assertSearchFieldIsDisplayed();
        searchSteps.assertSearchButtonIsClickable();
    }

    @Test
    public void searchResultsAreDisplayedWithEmptyInputTest() {
        String keywordSearch = "";
        searchSteps.searchForKeyword(keywordSearch);
        searchSteps.assertSearchResultText(("Search results: " + "“" + keywordSearch + "”").toUpperCase());
    }

    @Test
    public void searchResultsDisplayedAreRelevantToSearchKeywordTest() {
        String keywordSearch = "a";
        searchSteps.searchForKeyword(keywordSearch);
        searchSteps.searchResultsTitleTextIsRelevantToSearchKeyword(keywordSearch);
    }
    @Test
    public void loginAndSearchForProductNameTest() {
        String keywordSearch = "a";
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword(keywordSearch);
        searchSteps.assertSearchResultText(("Search results: " + "“" + keywordSearch + "”").toUpperCase());
    }

    @Test
    public void signSearchKeywordShouldNotDisplayErrorTest() {
        String keywordSearch = "!@#$%^&*()_+:{}|?>/";
        searchSteps.searchForKeyword(keywordSearch);
        searchSteps.assertSearchResultText(("Search results: " + "“" + keywordSearch + "”").toUpperCase());
    }

    @Test
    public void maxRangeCharacterSearchTest() {
        String keywordSearch = StringUtils.repeat("maxRangeCharacterSearchTest", 60);
        searchSteps.searchForKeyword(keywordSearch);
        searchSteps.assertSearchResultText(("Search results: " + "“" + "”").toUpperCase());
    }
    /*@Test
    public void searchResultsDisplayedListRelevantToSearchKeywordTest() {
        String keywordSearch = "a";
        searchSteps.searchForKeyword(keywordSearch);
        searchSteps.assertSearchResultsTitleTextIsRelevantToSearchKeyword(keywordSearch);
    }*/
}
