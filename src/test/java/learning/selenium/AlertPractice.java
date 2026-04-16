package learning.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Simple Alert
        driver.findElement(By.id("alertBtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//OK

        //Confirmation ALert
        driver.findElement(By.id("confirmBtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();// cancel
        Thread.sleep(2000);

        //Prompt Alert
        driver.findElement(By.id("promptBtn")).click();
        Alert promptAlert= driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("I am sachin");
        promptAlert.accept();













    }
}
