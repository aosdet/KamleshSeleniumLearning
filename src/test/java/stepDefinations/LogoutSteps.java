package stepDefinations;

import core.ConfigManager;
import core.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class LogoutSteps {

    HomePage homePage = new HomePage();

    @When("user clicks on signout button on home page")
    public void user_clicks_on_signout_button_on_home_page() {
        homePage.clickLogout();
    }

    @Then("user should be redirecting to the login page")
    public void user_should_be_redirecting_to_the_login_page() {

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), ConfigManager.get("baseURL"));

    }
}
