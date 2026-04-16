package Utilities;

import core.ConfigManager;
import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    int timeout=Integer.parseInt(ConfigManager.get("timeout"));
    WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));

    public void waitForElementTobeVisible(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForURLContainsText(String text){
        wait.until(ExpectedConditions.urlContains(text));
    }


}
