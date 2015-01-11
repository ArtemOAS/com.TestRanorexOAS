package com.ranorextest.steps;

import com.ranorextest.Category;
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
public class SaveAddUsersGranderMaleSteps {

    @When("Add user with grander male")
    public void chooseCategories(@Named("firstName") String firstName, @Named("lastName") String lastName){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        for (Category category: homePage.categories()){
            String categoryName = category.getСategory();
            homePage.getWebElementCategory(categoryName).click();
            homePage.enterFirstName.sendKeys(firstName);
            homePage.enterLastName.sendKeys(lastName);
            homePage.chooseMale();
            homePage.addUser();
        }
    }

    @When("Save added users with grander male")
    public void saveVIPUsers(){
        HomePage homePage = new HomePage(WebDriverFactory.getWebDriver());

        homePage.saveVIPUser();
    }

    @Then("Confirm the preservation of added users, grander male")
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
