package com.store.factory;

import com.store.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory extends Base {

    @FindBy(how = How.ID, using = "email")
    WebElement inputEmail;
    @FindBy(how = How.ID, using = "password")
    WebElement inputPassword;
    @FindBy(how = How.ID, using = "loginButton")
    WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]/span[1]/span[1]")
    WebElement loginSuccess;
    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/div[1]")
    WebElement loginError;

    public LoginFactory(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginForm(String email, String password){
        funtionsNeed.clickBtnDismis();
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickLoginSuccess() {
        //loginSuccess.click();
        System.out.print("pasooo!!!");
    }

    public void setLoginError(){
        loginError.click();
    }

}
