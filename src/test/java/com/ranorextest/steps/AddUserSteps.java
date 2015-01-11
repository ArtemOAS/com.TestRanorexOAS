package com.ranorextest.steps;

import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by Тёма on 26.12.2014.
 */
public class AddUserSteps {

    @Given("User opens the homepage")
    public void getUrlHome(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.getUrlHome();
    }


    @When("Enter user first name $Ben")
    public void enterFirstName(@Named("$Ben") String Ben){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.enterFirstName.sendKeys(Ben);
    }

    @When("Enter user last name $Bishop")
    public void enterLastName(@Named("$Bishop") String Bishop){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.enterLastName.sendKeys(Bishop);
    }

    @When("Add user")
    public void addUser(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.addUser();
    }

    @Then("Successful registered")
    public void createUserFemale(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        Assert.assertTrue("registered user", homePage.registeredUser.isDisplayed());
    }

}
