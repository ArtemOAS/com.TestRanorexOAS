package com.ranorextest.steps;

import com.ranorextest.pageobject.ModalDialogOKPage;
import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Тёма on 29.12.2014.
 */
public class AddUserOnlyFieldLastNameGranderMaleSteps {

    @When("Enter user $lastName")
    public void enterLastName(@Named("$lastName")String lastName){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.enterLastName.sendKeys(lastName);
    }

    @When("Choose grander male")
    public void chooseFemale(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.chooseMale();
    }

    @When("Add user")
    public void addUser(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.addUser();
    }

    @When("Confirm the incorrect filling")
    public void confirmIncorrectFilling(){
        ModalDialogOKPage modalDialogOKPage = new ModalDialogOKPage(WebDriverFactory.getWebDriver());
        Set<String> windowId = WebDriverFactory.getWebDriver().getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        String newAdwinID = itererator.next();
        WebDriverFactory.getWebDriver().switchTo().window(newAdwinID);
        modalDialogOKPage.confirmIncorrectFilling();
        WebDriverFactory.getWebDriver().close();
        WebDriverFactory.getWebDriver().switchTo().window(mainWinID);
    }

    @Then("The user with the completed only one field last name and grander male is not added")
    public void userIsDelete(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        Assert.assertTrue("Not users", homePage.userIsDeleted.isDisplayed());
    }
}
