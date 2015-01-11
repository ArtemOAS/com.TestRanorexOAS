package com.ranorextest.steps;

import com.ranorextest.pageobject.ModalDialogOKPage;
import com.ranorextest.webdriver.WebDriverFactory;
import com.ranorextest.pageobject.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Тёма on 28.12.2014.
 */
public class SaveLoadedUsersSteps {

    @When("Load Users")
    public void loadVIPUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.loadAllUsers();
    }

    @When("Save uploaded by users")
    public void saveVIPUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());
        homePage.saveVIPUser();
    }

    @Then("Confirm saving uploaded by users")
    public void confirmSaveUsers(){
        ModalDialogOKPage modalDialogOKPage = new ModalDialogOKPage(WebDriverFactory.getWebDriver());
        Set<String> windowId = WebDriverFactory.getWebDriver().getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();
        WebDriverFactory.getWebDriver().switchTo().window(newAdwinID);
        Assert.assertTrue("alertTextOK", modalDialogOKPage.alertTextOK.isDisplayed());
        modalDialogOKPage.confirmIncorrectFilling();
        WebDriverFactory.getWebDriver().switchTo().window(mainWinID);
    }
}
