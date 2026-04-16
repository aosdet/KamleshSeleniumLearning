package learning.selenium.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    WebDriverWait wait;
    String baseURL = "https://rahulshettyacademy.com/client/#/auth/login";
    String dashBoardURL = "https://rahulshettyacademy.com/client/#/dashboard/dash";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test(priority = 1)
    public void navigateToURL() {
        driver.get(baseURL);
        Assert.assertEquals(driver.getCurrentUrl(), baseURL);

    }

    @Test(priority = 2)
    public void invalidLoginTest() {
        driver.findElement(By.id("userEmail")).sendKeys("Kamlesh@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Test@1234");
        driver.findElement(By.id("login")).click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Incorrect')]")));
        Assert.assertTrue(errorMessage.isDisplayed());

    }

    @Test(priority = 3, dataProviderClass = DataProviderTest.class, dataProvider = "loginData")
    public void validloginTest(String username, String password) throws InterruptedException {
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys(username);
        driver.findElement(By.id("userPassword")).clear();
        driver.findElement(By.id("userPassword")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertEquals(driver.getCurrentUrl(), dashBoardURL);

    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
