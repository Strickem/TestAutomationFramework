package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase {

    HomePage homeObject ;
    UserRegistrationPage registerObject ;
    LoginPage loginObject ;

    @Given("user opens homepage")
    public void user_opens_homepage() {
        // Write code here that turns the phrase above into concrete actions
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
    }
    @When("I click on register link")
    public void i_click_on_register_link() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
    @And("I entered all necessary info")
    public void i_entered_all_necessary_info() {
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("mo","asad","mo@spam4.me","123456");
    }
    @Then("register page displayed successfully")
    public void register_page_displayed_successfully() {
        registerObject.userLogout();
    }

}
