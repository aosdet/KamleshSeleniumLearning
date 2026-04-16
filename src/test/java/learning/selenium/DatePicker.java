package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Select Date of Current month
//        List<WebElement> datesListMarch = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-state-default")));
//
//        for (WebElement date : datesListMarch) {
//            String dateValue = date.getText();
//            if (dateValue.equalsIgnoreCase("20")) {
//                date.click();
//                break;
//            }
//        }

        // Select Date of Next Month

        //Click Next Button
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        List<WebElement> datesListApril = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-state-default")));

        for (WebElement date : datesListApril) {
            String dateValue = date.getText();
            if (dateValue.equalsIgnoreCase("30")) {
                date.click();
                break;
            }
        }

        // Select your DOB

    }
}
