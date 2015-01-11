package com.ranorextest.steps;

import com.ranorextest.webdriver.WebDriverFactory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import com.ranorextest.pageobject.HomePage;

public class OpenRanorexSteps {

    @Given("User opens the homepage")
    public void givenUserOpenRanorex(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.getUrlHome();
    }

    @Then("The website ranorex is open")
    public void openRanorex(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue("VIP Database Test Web Application", homePage.namePage.isDisplayed());
    }
    
}
