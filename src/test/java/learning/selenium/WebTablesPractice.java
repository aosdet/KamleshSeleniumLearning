package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTablesPractice {

    public static void main(String[] args) {

        // Fetch WebTable as a one WebElement
        // Use Table WebElement as a Miniwebdriver

        WebDriver driver;
        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr[position()>1]"));// . means extention

        // How to read all the Data from webTable?
//        System.out.println(rows.size());
//        for (WebElement row : rows) {
//            System.out.println(row.getText());
//        }

        // find the price of course Master in selenium

        for (WebElement row : rows) {

            String CourseName = row.findElement(By.xpath(".//td[1]")).getText();
            if (CourseName.equalsIgnoreCase("Master In Selenium")) {
                String price = row.findElement(By.xpath(".//td[4]")).getText();
                System.out.println(price);
            }
        }

        // find the sum of Java Subject


    }
}
