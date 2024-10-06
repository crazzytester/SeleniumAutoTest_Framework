package com.companyname.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

public class DriverFactory {

    private static WebDriver driver;

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        return  dr.get();
    }

    public static void setDriver(WebDriver driverRef)
    {
        dr.set(driverRef);
    }

    public static void unloadDriver()
    {
        dr.remove();
    }
    public static void initDriver()
    {
        if(Objects.isNull(driver)) {
            driver = new ChromeDriver();
            setDriver(driver);
            getDriver().get("https://www.google.com");
            getDriver().manage().window().maximize();

        }
    }

    @AfterMethod
    public static void quitDriver()
    {
        if(Objects.nonNull(getDriver()))
        {
            getDriver().quit();
            unloadDriver();
        }
    }
}
