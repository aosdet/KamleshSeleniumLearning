package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsHandle {


    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String currentwindowHandleID = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();

        System.out.println(driver.getTitle());

        while (it.hasNext()) {

            // it.next()--> refer ID of the last window
            driver.switchTo().window(it.next());
        }
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[text()='SDET Essentials']")).click();

        // swithc to Main Tab
        driver.switchTo().window(currentwindowHandleID);
        System.out.println(driver.getTitle());


        driver.quit();// all tabs close
       // driver.close();// current tab close


    }
}
