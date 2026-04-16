package pages;

import Utilities.ElementsActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


// Maven Integration
//-> Build Management Tool
// Depenedency Managemeent Tool
// Maven Important commands
// Maven Life Cycle


// git and github
// Jenkins CI/CD Pipeline
// Parallel execution
// Cross browser Testing
// Headless execution
// How to find Broken links on any web page?






public class HomePage {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    By signoutby = By.xpath("//*[text()=' Sign Out ']");
    By filterproductby = By.xpath("(//input[@name='search'])[2]");
    By allproductsBy = By.xpath("//div[@class='card-body']/h5/b");

    ElementsActions elementsActions = new ElementsActions();

    public void clickLogout() {
        elementsActions.clickElement(signoutby);
        log.info("user clicks logout button");
    }

    public void filterProduct(String productName) {
        elementsActions.type(filterproductby, productName);
        elementsActions.pressEnterkey(filterproductby);

    }

    public boolean verifyFilterProducts(String productName) {
        List<WebElement> filterProducts = elementsActions.getElementList(allproductsBy);

        for (WebElement element : filterProducts) {
            if (element.getText().contains(productName)) {
                return true; // found match
            }
        }

        return false; // no match found after checking all
    }

}
