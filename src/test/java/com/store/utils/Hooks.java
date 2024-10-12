package com.store.utils;

import com.store.factory.AddAddressFactory;
import com.store.factory.LoginFactory;
import com.store.factory.RegisterFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends Base {

    @Before
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        funtionsNeed = new FuntionsNeed(driver);
        registerFactory = new RegisterFactory(driver);
        loginFactory = new LoginFactory(driver);
        addAddressFactory = new AddAddressFactory(driver);
    }

    @AfterAll
    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}