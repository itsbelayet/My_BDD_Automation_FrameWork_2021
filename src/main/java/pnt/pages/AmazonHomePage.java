package pnt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePage {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']") // Different Page
    private WebElement searchedItem;

    //*** FaceBook *****
    @FindBy(id = "email")
    private WebElement userName;

    @FindBy(xpath = "//input[@aria-label='Password']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clicksubmit;

    public void enterUserName(String name) {
        userName.sendKeys(name);
    }
    public void enterUserPassword(String password) {
        userPassword.sendKeys(password);
    }
    public void clickButton() {
        clicksubmit.click();
    }

    //**********************************************

    public void validateSearBarIsDisplayed() {
        Assert.assertTrue(searchBar.isDisplayed());
    }

    public void typeInSearchBar(String data) {
        searchBar.sendKeys(data);
    }

    public void clickOnSearchButton() {
        searchBtn.click();
    }

    public void validateSearchedItemIsDisplayed() {
        Assert.assertTrue(searchedItem.isDisplayed());
    }
}
