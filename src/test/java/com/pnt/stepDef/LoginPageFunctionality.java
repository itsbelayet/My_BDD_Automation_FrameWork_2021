package com.pnt.stepDef;

import cucumber.api.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pnt.base.TestBase;
import pnt.pages.AmazonHomePage;

public class LoginPageFunctionality {
    AmazonHomePage amazonHomePage;

    @Given("^user opens the browser and navigate to facebook\\.com$")
    public void user_opens_the_browser_and_navigate_to_facebook_com() throws InterruptedException {
        amazonHomePage= PageFactory.initElements(TestBase.driver,AmazonHomePage.class);
        TestBase.setupDriver();
        TestBase.driver.get("https://www.facebook.com");

    }
    @When("^user fills username field$")
    public void user_fills_username_field(){
        amazonHomePage.enterUserName("Belayet");
    }
    @Then("^user fills password field$")
    public void user_fills_password_field(){
        amazonHomePage.enterUserPassword("123456789");
    }
    @Then("^user clicks on sign in button$")
    public void user_clicks_on_sign_in_button(){
        amazonHomePage.clickButton();

    }
    @Then("^user is logged in successfully$")
    public void user_is_logged_in_successfully(){

    }
}
