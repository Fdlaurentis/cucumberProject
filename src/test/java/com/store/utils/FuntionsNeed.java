package com.store.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FuntionsNeed extends Base{

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]/span[1]/span")
    WebElement btnDismiss;

    public FuntionsNeed(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBtnDismis(){
        btnDismiss.click();
    }

    public void waitElement(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
