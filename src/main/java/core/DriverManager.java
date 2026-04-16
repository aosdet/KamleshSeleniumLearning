package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class DriverManager {

    public static WebDriver driver;

    public static void initialiseBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);

        }
        if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");

            driver = new FirefoxDriver(options);

        }

        if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");

            driver = new EdgeDriver(options);

        }

        int timeout=Integer.parseInt(ConfigManager.get("timeout"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));


    }

    public static WebDriver getDriver(){

        return driver;
    }

}
