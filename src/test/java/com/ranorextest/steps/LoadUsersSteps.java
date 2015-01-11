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
public class LoadUsersSteps {


    @Given("User opens the homepage")
    public void getUrlHome(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.getUrlHome();
    }

    @When("Push button 'Load'")
    public void loadAllUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.loadAllUsers();
    }

    @Then("Users loaded")
    public void usersLoaded(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue("All users",homePage.usersLoaded.isEmpty());
    }
}
