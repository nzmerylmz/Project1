package StepDefination;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    DialogContent dc = new DialogContent();

    @When("Enter valid username and password")
    public void enterValidUsernameAndPassword() {
        dc.findAndSend("username", "grup1cucumber");
        dc.findAndSend("password", "123456");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContainsText("loginSuccessMessage", "Log Out");
    }

    @When("Enter invalid {string} and {string}")
    public void enterInvalidAnd(String username, String password) {
        dc.findAndSend("username", username);
        dc.findAndSend("password", password);
        dc.findAndClick("loginButton");
    }

    @Then("User should not be logged in")
    public void userShouldNotBeLoggedIn() {
        dc.findAndContainsText("unsuccessfulLoginSuccessMessage","error");
    }
}
