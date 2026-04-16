package pages;

import Utilities.ElementsActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


public class LoginPage {

    private static final Logger log = LogManager.getLogger(LoginPage.class);

    By emailBy = By.id("userEmail");
    By passwordby = By.id("userPassword");
    By loginby = By.id("login");

    ElementsActions elementsActions = new ElementsActions();


    public void enterEmail(String email) {
        elementsActions.type(emailBy, email);
        log.info("User Entered email :"+ email);

    }

    public void enterPassword(String password) {
        elementsActions.type(passwordby, password);
        log.info("User Entered password :"+ password);
    }

    public void clickLogin() {
        elementsActions.clickElement(loginby);
        log.info("User Clicks Login Button");
    }


}
