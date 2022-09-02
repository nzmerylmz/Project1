package StepDefination;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {
    DialogContent dc=new DialogContent();


    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get(" https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click register button")
    public void clickRegisterButton() {
        dc.findAndClick("register");
    }

    @And("Enter personal data")
    public void enterPersonalData() {
        dc.findAndSend("firstName","grup1Proje6");
        dc.findAndSend("lastName","cucumberProje1");
        dc.findAndSend("addressStreet","Istanbul");
        dc.findAndSend("addressCity","Istanbul");
        dc.findAndSend("addressState","Istanbul");
        dc.findAndSend("addressZipCode","34000");
        dc.findAndSend("phoneNumber","2225556633");
        dc.findAndSend("ssn","12345678");
        dc.findAndSend("customerUsername","grup1cucumber");
        dc.findAndSend("customerPassword","123456");
        dc.findAndSend("confirmPassword","123456");
        dc.findAndClick("registerButton");
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.findAndContainsText("successMessage","success");
    }
}

