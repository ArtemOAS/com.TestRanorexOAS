package com.ranorextest.steps;

import com.ranorextest.Category;
import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Тёма on 28.12.2014.
 */
public class AllCategorySteps {

    @Given("User opens the homepage")
    public void getUrlHome(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.getUrlHome();
    }

    @When("The presence of the categories on the site ranorex")
    public void findAllCategory(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        for (Category category: homePage.categories()){
            String categoryName = category.getСategory();
            homePage.getWebElementCategory(categoryName).click();
        }
    }

    @Then("There are six categories")
    public void allCategory(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue(homePage.categories.isEmpty());
    }
}
