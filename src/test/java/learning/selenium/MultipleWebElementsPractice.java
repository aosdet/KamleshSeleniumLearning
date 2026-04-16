package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleWebElementsPractice {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Locator -tagName
        List<WebElement> list = driver.findElements(By.tagName("label"));
        //System.out.println(list.size());


        for(WebElement element:list){
            //System.out.println("Text Value is "+ element.getText());
        }

        List<WebElement> formGroupList=driver.findElements(By.className("form-group"));
        System.out.println(formGroupList.size());

        for(WebElement element:formGroupList){
            System.out.println("Text Value is "+ element.getText());
        }


        //driver.findElement(By.linkText("Apple")).click();

        driver.findElement(By.partialLinkText("403")).click();



    }
}
