package com.saucedemo.tests;

import engine.Bot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestCases {
  protected  WebDriver driver;
  protected Bot bot;
    @BeforeMethod
    public void beforeMethod() {
        ChromeOptions options;
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver= new ChromeDriver(options);
        bot= new Bot(driver);

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
