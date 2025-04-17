package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Page {
    public Login(WebDriver driver){
        super(driver);
    }
    // locators

    public static final By usernameInput=By.id("user-name");
    public static final By passwordInput=By.id("password");
    public static final By loginButton=By.id("login-button");
    

    // Actions
    public void navigateToLoginPage() {
        driver.navigate().to("https://www.saucedemo.com/");
    }
    public void login (String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }




}
