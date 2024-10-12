package com.store.factory;

import com.store.utils.Base;
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

public class AddAddressFactory extends Base {

    @FindBy(how = How.ID, using = "navbarAccount")
    WebElement clicAccount;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-menu-panel-0']/div/button[2]")
    WebElement clicOrderPayment;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-menu-panel-3']/div/button[3]")
    WebElement clicAddress;
    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-address/div/app-address/mat-card/div/button/span[1]/span")
    WebElement clicNewAddress;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide a country.']")
    WebElement inputCountry;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide a name.']")
    WebElement inputName;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide a mobile number.']")
    WebElement inputMobile;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide a ZIP code.']")
    WebElement inputZip;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide an address.']")
    WebElement inputAddress;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide a city.']")
    WebElement inputCyte;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Please provide a state.']")
    WebElement inputState;
    @FindBy(how = How.ID, using = "submitButton")
    WebElement clicSubmint;

    public AddAddressFactory(WebDriver driver){
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void setClicAccount(){
        funtionsNeed.waitElement(clicAccount);
        clicAccount.click();
        funtionsNeed.waitElement(clicOrderPayment);
        clicOrderPayment.click();
        funtionsNeed.waitElement(clicAddress);
        clicAddress.click();
    }

    public void setClicNewAddress(){
        clicNewAddress.click();
    }

    public void setAddressForm(String country, String name, String mobile, String zip, String address, String city, String state){
        inputCountry.sendKeys(country);
        inputName.sendKeys(name);
        inputMobile.sendKeys(mobile);
        inputZip.sendKeys(zip);
        inputAddress.sendKeys(address);
        inputCyte.sendKeys(city);
        inputState.sendKeys(state);

    }

    public void setClicSubmit(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", clicSubmint);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("cdk-overlay-0")));
        funtionsNeed.waitElement(clicSubmint);
        clicSubmint.click();
    }
}
