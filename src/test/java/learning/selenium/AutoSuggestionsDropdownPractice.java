package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionsDropdownPractice {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("autocomplete")).sendKeys("ind");

        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@id,'ui-id')]"));
        System.out.println(list.size());


        for(WebElement element:list){
            System.out.println(element.getText());
            if(element.getText().equalsIgnoreCase("india")){
                element.click();
                break;
            }
        }




    }
}
