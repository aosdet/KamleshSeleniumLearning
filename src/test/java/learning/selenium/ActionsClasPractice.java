package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClasPractice {

    public static void main(String[] args) throws InterruptedException {
        //Actions Class
        // Mouse Related Operatios
        //hover

        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        Actions actions=new Actions(driver);
       // actions.moveToElement(driver.findElement(By.xpath("//button[@class='dropbtn']"))).click(driver.findElement(By.xpath("//a[text()='Laptops']"))).perform();
       // actions.sendKeys(driver.findElement(By.id("Wikipedia1_wikipedia-search-input")),"kamlesh").perform();

       // actions.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"))).perform();

        //actions.contextClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"))).perform();

        actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();


        WebElement slider1=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        WebElement slider2=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));

        actions.dragAndDropBy(slider1,-25,0).dragAndDropBy(slider2,-30,0).perform();

        // Assigment
        // send keys -Kamlesh   ---> UI (KAMLESH)

        Thread.sleep(4000);
        //driver.quit();


    }
}
