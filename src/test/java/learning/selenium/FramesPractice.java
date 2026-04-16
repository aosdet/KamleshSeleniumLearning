package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramesPractice {


    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.xpath("(//a[@href='lifetime-access'])[2]")).click();


        driver.switchTo().parentFrame();// main web Page
        System.out.println(driver.getTitle());


    }
}
