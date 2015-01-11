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


    @When("Enter user first name")
    public void enterFirstName(@Named("firstName") String firstName){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.enterFirstName.sendKeys(firstName);
    }

    @When("Enter user last name")
    public void enterLastName(@Named("lastName") String lastName){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.enterLastName.sendKeys(lastName);
    }

    @When("Add user")
    public void addUser(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.addUser();
    }

    @Then("Successful registered")
    public void createUserFemale(@Named("firstName") String firstName, @Named("lastName") String lastName){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        Assert.assertTrue("registered user", homePage.registeredUser.isDisplayed());
    }

}
