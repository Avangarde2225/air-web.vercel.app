package stepDefinitions;

import POM.signInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logInSteps {
    signInPage sp = new signInPage();

    @When("^I enter my correct email$")
    public void i_enter_my_correct_email() throws Throwable {
        sp.getInputUserName();
    }

    @Then("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
       sp.getPassword();
    }

    @Then("^I click on the login button my account should be loaded$")
    public void i_click_on_the_login_button_my_account_should_be_loaded() throws Throwable {
       sp.clickOnLoginButton();
    }

}
