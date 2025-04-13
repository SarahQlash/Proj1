package testPackage;
import org.openqa.selenium.*;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass extends TestMethods {
    /**
     * Open Google Chrome
     * Navigate to [<a href= https://duckduckgo.com />]
     * Assert that the page title is [Google]
     * Close Google Chrome
     */
    @Test(description = "Given I am opening Google Chrome " +
            "When I navigate to [https://duckduckgo.com]" +
            "Then the page title should be [Google]" +
            "And I close Google Chrome")

    public void navigateToDuckDuckGoAndCheckPageTitle() {
        driver.navigate().to("https://duckduckgo.com");
       String pageTitle = driver.getTitle();
       Assert.assertEquals(pageTitle,"Google");
    }

    /**
     Open Google Chrome
     Navigate to [<a href= https://duckduckgo.com/ />]
     Assert that the DuckDuckGo logo is displayed
     Close Google Chrome
     */

    @Test(description = "Given I am opening Google Chrome " +
            "When I navigate to [https://duckduckgo.com/]" +
            "Then the DuckDuckGo logo should be displayed" +
            "And I close Google Chrome")

    public void navigateToDuckDuckGoAndCheckLogoIsDisplayed(){
        driver.navigate().to("https://duckduckgo.com");
        boolean isDisplayed=bot.isDisplayed(By.xpath("//div[contains(@class,'headerWrapDesktop')]//img"));
        Assert.assertTrue(isDisplayed,"DuckDuckGo logo is not displayed");

    }
    /**
     OOpen Google Chrome
     Navigate to [<a href= https://duckduckgo.com />]
     Search for [Selenium WebDriver]
     Assert that the link of the first result is [<a href= https://www.selenium.dev/documentation/webdriver/ />]
     Close Google Chrome

     */
    @Test(description = "Given I am opening Google Chrome " +
            "When I navigate to [https://duckduckgo.com/]" +
            "And I search for [Selenium WebDriver]" +
            "Then the link of the first result should be [ <a href= https://www.selenium.dev/documentation/webdriver/ />]" +
            "And I close Google Chrome")

    public void searchTest(){
        driver.navigate().to("https://duckduckgo.com/");
        By searchBox = By.id("searchbox_input");
        bot.sendKeys(searchBox,"Selenium WebDriver"+ Keys.ENTER);

        By firstResultLink=By.xpath("//a[@data-testid='result-extras-url-link'][1]");
        String firstResultUrlText = bot.getAttribute(firstResultLink,"href");
        Assert.assertEquals(firstResultUrlText,"https://www.selenium.dev/documentation/webdriver/");

   }
}

