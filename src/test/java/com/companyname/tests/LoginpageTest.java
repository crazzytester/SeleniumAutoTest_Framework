package com.companyname.tests;

import com.companyname.Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginpageTest extends BaseTest{
    @Test
    public void test1() {
        DriverFactory.getDriver().findElement(By.name("q")).sendKeys("Raman Kumar", Keys.ENTER);
    }

    @Test
    public void test2()
    {
        DriverFactory.getDriver().findElement(By.name("q")).sendKeys("QA Automation", Keys.ENTER);
    }
}
