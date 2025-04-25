package com.saucedemo.tests.login;

import com.saucedemo.Login;
import com.saucedemo.Product;
import com.saucedemo.tests.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabLoginTests extends TestCases {
    @Test
    public void test() {
        //navigate to the login page
        // Create an instance of the Login page
        Login loginPage = new Login(driver);
        loginPage.navigateToLoginPage();

        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        // Perform login with valid credentials
        loginPage.login(validUsername, validPassword);
        // Verify that the user is redirected to the product page
        Product product = new Product(driver);
        var isDisplayed = product.isPageTitleDisplayed();
        // Add assertions to verify successful navigation to the product page
        Assert.assertTrue(isDisplayed, "Product page is not displayed after login");
    }

    @Test
    public void fluentLoginTest() {
        var isDisplayed = new Login(driver)
                .navigateToLoginPage()
                .login("standard_user", "secret_sauce")
                .isPageTitleDisplayed();
        Assert.assertTrue(isDisplayed, "Page title is not displayed after login");
    }
}
