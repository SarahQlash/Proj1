package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product extends Page {
    public Product(WebDriver driver){
        super(driver);
    }

   private static final By productTitle=By.xpath("//span[@data-test='title']");
    public boolean isDisplayed(){
        return driver.findElement(productTitle).isDisplayed();

    }

}
