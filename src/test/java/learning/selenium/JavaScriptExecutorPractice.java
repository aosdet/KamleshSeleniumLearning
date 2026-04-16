package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorPractice {


    public static void main(String[] args) {

        // Windows Related Operations -Scrolling
        // Scrolling to web Element

        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // js.executeScript("window.scrollBy(0,2000)");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.partialLinkText("500"));

        //js.executeScript("arguments[0].scrollIntoView(true);", element);

        //sendkeys

        js.executeScript("arguments[0].value='sachin';",driver.findElement(By.id("email")));

        //click
        js.executeScript("arguments[0].click();",driver.findElement(By.name("start")));


        //How to handle hidden elements ?
        // sendkeys("sachin)--->UI("SACHIN");



    }
}
