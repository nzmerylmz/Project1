package StepDefination;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {
    DialogContent dc=new DialogContent();
    @And("Click on Bill Pay")
    public void clickOnBillPay() {
        dc.findAndClick("billPayButton");
    }

    @When("Enter {string} and {string} and other infos")
    public void enterAndAndOtherInfos(String payeeName, String amount) {
        dc.findAndSend("paymentType",payeeName);
        dc.findAndSend("paymentAddressStreet","Istanbul");
        dc.findAndSend("paymentAddressCity","Istanbul");
        dc.findAndSend("paymentAddressState","Istanbul");
        dc.findAndSend("paymentAddressZipCode","34000");
        dc.findAndSend("paymentNumber","1234");
        dc.findAndSend("payeePhoneNumber","5552223366");
        dc.findAndSend("accountNumber","123458");
        dc.findAndSend("verifyAccountNumber","123458");
        dc.findAndSend("amount",amount);
        dc.findAndClick("sendPaymentButton");
    }

    @Then("Payment complete message should be displayed")
    public void paymentCompleteMessageShouldBeDisplayed() {
        dc.findAndContainsText("paymentCompleteMessage","complete");
    }
}
