package com.pnt.stepDef;

import cucumber.api.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pnt.base.TestBase;
import pnt.pages.AmazonHomePage;

public class AmazonPageFunctionality {
    AmazonHomePage amazonHomePage;

    @Given("^user opens the browser and navigate to amazon\\.com$")
    public void user_opens_the_browser_and_navigate_to_amazon_com(){
        TestBase.setupDriver();
        TestBase.driver.get("https://www.amazon.com");
        amazonHomePage= PageFactory.initElements(TestBase.driver,AmazonHomePage.class);
    }

    @When("^user can see the search bar$")
    public void user_can_see_the_search_bar(){
        amazonHomePage.validateSearBarIsDisplayed();
    }

    @Then("^user types Java Books in the searchh bar$")
    public void user_types_Java_Books_in_the_searchh_bar(){
        amazonHomePage.typeInSearchBar("Java Books");
    }

    @Then("^user clicks on search button$")
    public void user_clicks_on_search_button(){
        amazonHomePage.clickOnSearchButton();
    }

    @Then("^user can see search result of Element$")
    public void user_can_see_search_result_of_Element(){
        amazonHomePage.validateSearchedItemIsDisplayed();
    }

    // Search Functionality
    @Then("^user types (.*) in the search bar$")
    public void user_types_itemNames_in_the_search_bar(String itemName){
        amazonHomePage.typeInSearchBar(itemName);
    }

    @Then("^user closes the browser$")
    public void user_closes_the_browser(){
        TestBase.driver.quit();
    }
}
