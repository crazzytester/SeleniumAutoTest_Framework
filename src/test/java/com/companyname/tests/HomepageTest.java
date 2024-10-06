package com.companyname.tests;

import com.companyname.Driver.DriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public final class HomepageTest extends BaseTest {

    private HomepageTest(){

    }

    @Test
    public void test3() {
        DriverFactory.getDriver().findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
    }
}
