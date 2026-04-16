package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();// Open Browser
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Kamlesh");
        driver.findElement(By.xpath("//input[@value='saturday']")).click();


        // Indexing in Xpath
        String text=driver.findElement(By.xpath("(//div[@class='form-group'])[5]")).getText();
        System.out.println(text);


        //Parent to child Traversal
        //div[@class='date-posts']/div/div--Xpath



        // sibling to sibling Traversal forward
        //div[@id='Wikipedia1_wikipedia-search-results-header']/following-sibling::div




        // sibling to sibling Traversal Backward
        //div[@id='Wikipedia1_wikipedia-search-results']/preceding-sibling::div




        // child to parent Traversal
        ////input[@id='female']/parent::div



        // Dynamic Xpaths
        //input[contains(@id,'email')]

        //text function in Xpath
        // This is Last option for Xpath
        //button[text()='START']





        Thread.sleep(5000);
        driver.quit();

    }
}
