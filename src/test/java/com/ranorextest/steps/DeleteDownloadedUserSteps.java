package com.ranorextest.steps;

import com.ranorextest.AllVIPUsers;
import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by Тёма on 28.12.2014.
 */
public class DeleteDownloadedUserSteps {

    @Given("User opens the homepage")
    public void getUrlHome(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.getUrlHome();
    }

    @When("Load users")
    public void loadVIPUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.loadAllUsers();
    }

    @When("Remove downloaded users")
    public void chooseCategories() {
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        for (AllVIPUsers VIPAllUsers : homePage.VIPUsers()) {
            String VIPUsersName = VIPAllUsers.getVIPUsers();
            homePage.getWebElementVIPUsers(VIPUsersName).click();
            homePage.delete();
        }
    }

    @Then("Users downloaded removed")
    public void userIsDelete(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue("VIPs is empty", homePage.userIsDeleted.isDisplayed());
    }
}
