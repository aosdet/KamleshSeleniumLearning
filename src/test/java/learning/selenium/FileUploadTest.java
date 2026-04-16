package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadTest {


    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\sachinsharma05\\OneDrive - Nagarro\\Desktop\\Personal docs\\DL.pdf");

       WebElement multipleFileUpload= driver.findElement(By.id("multipleFilesInput"));
       multipleFileUpload.sendKeys("C:\\Users\\sachinsharma05\\OneDrive - Nagarro\\Desktop\\Personal docs\\DL.pdf");
       multipleFileUpload.sendKeys("C:\\Users\\sachinsharma05\\OneDrive - Nagarro\\Desktop\\Personal docs\\epfo.pdf");

       // Download File into download Folder
        // Download file in Required Folder
    }
}
