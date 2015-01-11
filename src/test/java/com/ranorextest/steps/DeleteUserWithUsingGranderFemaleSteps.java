package com.ranorextest.steps;

import com.ranorextest.Category;
import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by Тёма on 28.12.2014.
 */
public class DeleteUserWithUsingGranderFemaleSteps {

    @When("Delete a user with using grander female")
    public void deleteUserGranderFemale(@Named("firstName") String firstName, @Named("lastName") String lastName){

        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        for (Category category: homePage.categories()){
            String categoryName = category.getСategory();
            homePage.getWebElementCategory(categoryName).click();
            homePage.enterFirstName.sendKeys(firstName);
            homePage.enterLastName.sendKeys(lastName);
            homePage.chooseFemale();
            homePage.addUser();
            homePage.delete();
        }
    }

    @Then("User with using grander female is delete")
    public void userIsDelete(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue("VIPs is empty",homePage.userIsDeleted.isDisplayed());
    }
}
