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
public class DisconnectSteps {

    @Given("User opens the homepage")
    public void getUrlHome(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.getUrlHome();
    }

    @When("Disconnect from the database")
    public void disconnect(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.disconnect();
    }

    @Then("Connection has been disconnected from the database")
    public void checkDisconnect(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        Assert.assertTrue("Disconnect",homePage.checkDisconnect.isDisplayed());
    }
}
