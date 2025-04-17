package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {
    // Page class that contains common methods and properties for all pages
    protected final WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }


    // Common methods can be added here, such as navigation, waiting, etc.
}
