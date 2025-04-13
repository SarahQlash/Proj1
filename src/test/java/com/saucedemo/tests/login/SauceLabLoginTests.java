package com.saucedemo.tests.login;

import com.saucedemo.tests.TestCases;
import org.testng.annotations.Test;

public class SauceLabLoginTests extends TestCases {
    @Test
    public void validLoginTest() {
        // Navigate to the login page
       driver.navigate().to("https://www.saucedemo.com/");

    }
}
