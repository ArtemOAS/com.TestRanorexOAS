package com.ranorextest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Тёма on 10.01.2015.
 */
public class ModalDialogOKCancelPage {
    WebDriver webDriver;

    public ModalDialogOKCancelPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath=".//*[@id='alertOKCancel']/center/button[text()='OK']")
    WebElement connectOk;
    public void connectOk(){
        connectOk.click();
    }

    public void connectCancel(){
        WebElement connectCancel = (new WebDriverWait(webDriver,40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='alertOKCancel']/center/button[text()='Cancel']")));
        connectCancel.click();
    }
}
