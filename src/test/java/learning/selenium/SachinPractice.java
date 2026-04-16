package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SachinPractice {


    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.id("autocomplete")).sendKeys("Ind");
//
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@id,'ui-id')]")));
//
//        List<WebElement> elements=driver.findElements(By.xpath("//div[contains(@id,'ui-id')]"));
//        System.out.println(elements.size());
//
//        for(WebElement element:elements){
//            if(element.getText().equalsIgnoreCase("india")){
//                element.click();
//                break;
//
//            }
//        }

        Actions actions=new Actions(driver);
        actions.dragAndDropBy(driver.findElement(By.xpath("(//div[@id='slider-range']/span)[1]")),10,0).build().perform();


    }
}
