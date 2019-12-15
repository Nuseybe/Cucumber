package stepDefs;

import Pages.LoginPage;
import Utilities.Configuration;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class VerifyLoginFunctionality {

    WebDriver driver=Driver.driverSetup("chrome");
    LoginPage loginPage=new LoginPage();

    @Given("^Nagivate to login page$")
    public void nagivate_to_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        driver.get(Configuration.getProperties("browserUrl"));


    }
    @Then("^User logs in with valid credentials username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_logs_in_with_valid_credentials_username_password(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
    }
    @Then("^Verify user is in Homepage$")
    public void verify_user_is_in_Homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
