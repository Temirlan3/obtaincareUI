package UI.stepDefs;

import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.pageObject.LoginPage;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
       
      
    }
    @When("user enters {string} in username input field")
    public void user_enters_in_username_input_field(String userName) {
        loginPage.inputUserName(userName);

       
      
    }
    @When("user type {string} in password input field")
    public void user_type_in_password_input_field(String password) {
        loginPage.inputPassword(password);
       
      
    }
    @When("user click on Login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
       
      
    }
    @Then("user should successfully long to Home page")
    public void user_should_successfully_long_to_home_page() {
       
      
    }
}
