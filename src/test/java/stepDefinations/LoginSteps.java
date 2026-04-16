package stepDefinations;

import Utilities.WaitUtils;
import com.aventstack.extentreports.ExtentTest;
import core.ConfigManager;
import core.DriverManager;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {


    private static final Logger log = LogManager.getLogger(LoginSteps.class);
    WaitUtils waitUtils = new WaitUtils();
    LoginPage loginPage = new LoginPage();



    @Given("user is on login page of ecommerce application")
    public void user_is_on_login_page_of_ecommerce_application() {
        DriverManager.getDriver().get(ConfigManager.get("baseURL"));
        log.info("user naviagting to the BaseURL "+ ConfigManager.get("baseURL"));
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), ConfigManager.get("baseURL"));
    }


    @When("user enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("user clicks on login Button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();

    }

    @Then("user should be redirecting to the dashbaord page")
    public void user_should_be_redirecting_to_the_dashbaord_page() {
        waitUtils.waitForURLContainsText("dashboard");
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), ConfigManager.get("dashBoardURL"));


    }


    @When("user enters invalid {string} and {string}")
    public void user_enters_invalid_and(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @Then("user should remains on login page itself")
    public void user_should_remains_on_login_page_itself() {
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), ConfigManager.get("baseURL"));

    }


}
