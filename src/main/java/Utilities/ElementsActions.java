package Utilities;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ElementsActions {

    WaitUtils waitUtils = new WaitUtils();
    Actions actions = new Actions(DriverManager.getDriver());

    public void clickElement(By locator) {
        waitUtils.waitForElementTobeVisible(locator);
        DriverManager.getDriver().findElement(locator).click();
    }

    public void type(By locator, String value) {
        waitUtils.waitForElementTobeVisible(locator);
        DriverManager.getDriver().findElement(locator).sendKeys(value);
    }

    public void pressEnterkey(By locator) {
        actions.moveToElement(DriverManager.getDriver().findElement(locator)).keyDown(Keys.ENTER).perform();
        actions.moveToElement(DriverManager.getDriver().findElement(locator)).keyUp(Keys.ENTER).perform();


    }

    public List<WebElement> getElementList(By locator){

        List<WebElement> ElementList= DriverManager.getDriver().findElements(locator);
        return ElementList;

    }


}
