package com.saucedemo;

import org.openqa.selenium.WebDriver;

public abstract class page {
    // Page class that contains common methods and properties for all pages
    protected final WebDriver driver;

    public page(WebDriver driver) {
        this.driver = driver;
    }

    // Common methods can be added here, such as navigation, waiting, etc.
}
