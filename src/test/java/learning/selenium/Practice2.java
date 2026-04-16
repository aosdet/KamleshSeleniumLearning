package learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(5000);
        driver.quit();// close the browser


    }
}
