package testPackage;

import engine.Bot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestMethods {
    WebDriver driver;
    Bot bot;

    @BeforeMethod
    public void beforeMethod(){
        ChromeOptions options;
        options= new ChromeOptions();
        options.addArguments("start-maximized");
        //  options.setBrowserVersion("134");
        options.setImplicitWaitTimeout(Duration.ofSeconds(10));
        driver = new ChromeDriver(options);
        bot= new Bot(driver);
    }


    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
