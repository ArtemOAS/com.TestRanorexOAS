package com.ranorextest.steps;

import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by Тёма on 28.12.2014.
 */
public class ClearUploadedUsersSteps {

    @When("Load users")
    public void loadVIPUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.loadAllUsers();
    }

    @When("Clear all user uploaded")
    public void clearAllVIPUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.clear();
    }

    @Then("All users downloaded cleared")
    public void userIsDelete(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue("VIPs is empty", homePage.userIsDeleted.isDisplayed());
    }
}
