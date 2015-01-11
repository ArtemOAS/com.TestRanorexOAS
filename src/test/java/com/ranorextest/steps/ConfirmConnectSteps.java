package com.ranorextest.steps;

import com.ranorextest.pageobject.ModalDialogOKCancelPage;
import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Тёма on 28.12.2014.
 */
public class ConfirmConnectSteps {


    @When("That would connect from the database, click to connect")
    public void connect(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.connect();
    }

    @When("Confirm the connection to the database")
    public void confirmConnection(){
        ModalDialogOKCancelPage modalDialogOKCancelPage = new ModalDialogOKCancelPage(WebDriverFactory.getWebDriver());

        Set<String> windowId = WebDriverFactory.getWebDriver().getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();
        WebDriverFactory.getWebDriver().switchTo().window(newAdwinID);
        modalDialogOKCancelPage.connectOk();
        WebDriverFactory.getWebDriver().switchTo().window(mainWinID);
    }

    @Then("Database connection successfully")
    public void connected(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        //Assert.assertTrue("connected",homePage.checkConnect.isDisplayed());
    }
}
