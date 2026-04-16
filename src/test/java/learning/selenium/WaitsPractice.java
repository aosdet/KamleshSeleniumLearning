package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsPractice {


    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Implicit Wait -10 sec
        // it will wait max 10 sec
        // it will define only once in framework
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("email")).sendKeys("sachin@gmail.com");
        // driver.findElement(By.id("kamlesh")).sendKeys("43242");


        //Explicit Wait
        // specific webelement and specific conditions
        // Max 10 sec wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement Start = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("start")));
        Start.click();


        //FluentWait


    }
}
