package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class SearchProductSteps {

    HomePage homePage = new HomePage();

    @When("user enters  Product {string} into the Search Filter")
    public void user_enters_product_into_the_search_filter(String productName) {

        homePage.filterProduct(productName);
    }

    @Then("user should view the {string} product into the Search Result")
    public void user_should_view_the_product_into_the_search_result(String productName) {

        boolean b = homePage.verifyFilterProducts(productName);
        Assert.assertTrue(b);
    }

}
