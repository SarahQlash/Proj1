package com.saucedemo.tests.login;

import com.saucedemo.Login;
import com.saucedemo.Product;
import com.saucedemo.tests.TestCases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabLoginTests extends TestCases {
    @Test
    public void test() {
        //navigate to the login page
        // Create an instance of the Login page
        Login loginPage = new Login(driver);
        loginPage.navigateToLoginPage();
        String validUsername= "standard_user";
        String validPassword="secret_sauce";
        loginPage.login(validUsername,validPassword);
        // Add assertions to verify successful login
        Product product = new Product(driver);
        product.isDisplayed();
        // Add assertions to verify successful navigation to the product page
        Assert.assertTrue(product.isDisplayed(), "Product page is not displayed after login");


    }
}
