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

public class RegisterFactory extends Base {

    @FindBy(how = How.ID, using = "emailControl")
    WebElement inputEmail;
    @FindBy(how = How.ID, using = "passwordControl")
    WebElement inputPass;
    @FindBy(how = How.ID, using = "repeatPasswordControl")
    WebElement inputRePass;
    @FindBy(how = How.XPATH, using = "//*[@id=\"registration-form\"]/div[1]/mat-form-field[1]/div/div[1]")
    WebElement inputSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-option-1\"]/span")
    WebElement optionSelect;
    @FindBy(how = How.ID, using = "securityAnswerControl")
    WebElement inputAnswer;
    @FindBy(how = How.ID, using = "registerButton")
    WebElement btnRegister;
    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/h1")
    WebElement viewPassRegister;

    public RegisterFactory(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void fillOutForm(String email, String password, String repeatPassword, String securityAnswer) {
        funtionsNeed.clickBtnDismis();
        inputEmail.sendKeys(email);
        inputPass.sendKeys(password);
        inputRePass.sendKeys(repeatPassword);
        inputAnswer.sendKeys(securityAnswer);
        inputSelect.click();
        optionSelect.click();
    }

    public void clickRegister() {
        funtionsNeed.waitElement(btnRegister);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("cdk-overlay-0")));
        btnRegister.click();
    }

    public void registerSuccess() {
        viewPassRegister.click();
    }

}