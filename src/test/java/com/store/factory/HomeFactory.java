package com.store.factory;

import com.store.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomeFactory extends Base {

    @FindBy(how = How.ID, using = "navbarAccount")
    WebElement btnAccount;
    @FindBy(how = How.ID, using = "navbarLoginButton")
    WebElement btnLogin;
    @FindBy(how = How.LINK_TEXT, using = "Not yet a customer?")
    WebElement linkRegister;

    public HomeFactory(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToRegister() {
        btnAccount.click();
        btnLogin.click();
        linkRegister.click();
    }

}