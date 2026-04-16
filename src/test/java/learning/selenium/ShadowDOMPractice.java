package learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDOMPractice {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // DOM (Document Object Model)
        // Shadow DOM- Mini DOM inside Main DOM


        WebElement shadowHost = driver.findElement(By.id("shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement blogLink = shadowRoot.findElement(By.linkText("Blog"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", blogLink);


    }
}
