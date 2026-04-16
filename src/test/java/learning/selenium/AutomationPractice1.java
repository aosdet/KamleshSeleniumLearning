package learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractice1 {


    public static void main(String[] args) {

        // chrome
        // WebDriver is the Parent Interface of these 3 Classes

        WebDriver driver;
        driver = new ChromeDriver();// UpCasting


        //firefox
        driver = new FirefoxDriver();


        //edge
        driver = new EdgeDriver();


    }
}
