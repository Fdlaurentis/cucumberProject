package com.store.utils;

import com.store.factory.AddAddressFactory;
import com.store.factory.HomeFactory;
import com.store.factory.LoginFactory;
import com.store.factory.RegisterFactory;
import org.openqa.selenium.WebDriver;

public class Base {

    protected static WebDriver driver;
    protected static int TIME_OUT =10;
    protected static FuntionsNeed funtionsNeed;
    protected static HomeFactory homeFactory;
    protected static RegisterFactory registerFactory;
    protected static LoginFactory loginFactory;
    protected static AddAddressFactory addAddressFactory;
}
