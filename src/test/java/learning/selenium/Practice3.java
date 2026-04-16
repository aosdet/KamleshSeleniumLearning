package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Locator -id
//        WebElement Name = driver.findElement(By.id("name"));
//        Name.sendKeys("Kamlesh");// used for sending Data
//
//        WebElement email=driver.findElement(By.id("email"));
//        email.sendKeys("sachin@gmail.com");
//
//        WebElement maleRadioBtn=driver.findElement(By.id("male"));
//        maleRadioBtn.click();
//
//        WebElement tuesdaycheckBox=driver.findElement(By.id("tuesday"));
//        WebElement fridayCheckBox=driver.findElement(By.id("friday"));
//        WebElement mondayCheckBox=driver.findElement(By.id("monday"));
//
//        tuesdaycheckBox.click();
//        fridayCheckBox.click();
//        mondayCheckBox.click();


        // Locator-name
        WebElement Start = driver.findElement(By.name("start"));
        System.out.println(Start.getText());// START
        Start.click();


        Thread.sleep(2500);
        WebElement Stop = driver.findElement(By.className("stop"));
        System.out.println(Stop.getText());// STOP
        Stop.click();



    }
}
