package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorPractice {


    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        WebElement title = driver.findElement(By.xpath("//div[@id='header-inner']/div/h1"));
        System.out.println(title.isDisplayed());

        WebElement phone = driver.findElement(By.cssSelector("input[id='phone']"));
        System.out.println(phone.getAttribute("placeholder"));

        phone.sendKeys("89078676");


    }
}
