package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText="Register")
    private WebElement register;

    @FindBy(id="customer.firstName")
    private WebElement firstName;

    @FindBy(id="customer.lastName")
    private WebElement lastName;

    @FindBy(id="customer.address.street")
    private WebElement addressStreet;

    @FindBy(id="customer.address.city")
    private WebElement addressCity;

    @FindBy(id="customer.address.state")
    private WebElement addressState;

    @FindBy(id="customer.address.zipCode")
    private WebElement addressZipCode;

    @FindBy(id="customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id="customer.ssn")
    private WebElement ssn;

    @FindBy(id="customer.username")
    private WebElement customerUsername;

    @FindBy(id="customer.password")
    private WebElement customerPassword;

    @FindBy(id="repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(css="[value='Register']")
    private WebElement registerButton;

    @FindBy(css="[class=\"title\"]+p")
    private WebElement successMessage;

    @FindBy(name="username")
    private WebElement username;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(css="[value='Log In']")
    private WebElement loginButton;

    @FindBy(linkText="Log Out")
    private WebElement loginSuccessMessage;

    @FindBy(css="h1[class='title']+p")
    private WebElement unsuccessfulLoginSuccessMessage;

    @FindBy(linkText="Bill Pay")
    private WebElement billPayButton;

    @FindBy(name="payee.name")
    private WebElement paymentType;
    @FindBy(name="payee.address.street")
    private WebElement paymentAddressStreet;
    @FindBy(name="payee.address.city")
    private WebElement paymentAddressCity;

    @FindBy(name="payee.address.state")
    private WebElement paymentAddressState;

    @FindBy(name="payee.address.zipCode")
    private WebElement paymentAddressZipCode;

    @FindBy(name="payee.phoneNumber")
    private WebElement payeePhoneNumber;

    @FindBy(name="payee.accountNumber")
    private WebElement accountNumber;

    @FindBy(name="verifyAccount")
    private WebElement verifyAccountNumber;

    @FindBy(name="amount")
    private WebElement amount;

    @FindBy(css="[value='Send Payment']")
    private WebElement sendPaymentButton;

    @FindBy(xpath="//*[text()='Bill Payment Complete']")
    private WebElement paymentCompleteMessage;

    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "firstName" : myElement =firstName; break;
            case "lastName" : myElement =lastName; break;
            case "addressStreet" : myElement =addressStreet; break;
            case "addressCity" : myElement =addressCity; break;
            case "addressState" : myElement =addressState; break;
            case "addressZipCode" : myElement =addressZipCode; break;
            case "phoneNumber" : myElement =phoneNumber; break;
            case "ssn" : myElement =ssn; break;
            case "customerUsername" : myElement =customerUsername; break;
            case "customerPassword" : myElement =customerPassword; break;
            case "confirmPassword" : myElement =confirmPassword; break;
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "paymentType" : myElement =paymentType; break;
            case "paymentAddressStreet" : myElement =paymentAddressStreet; break;
            case "paymentAddressCity" : myElement =paymentAddressCity; break;
            case "paymentAddressState" : myElement =paymentAddressState; break;
            case "paymentAddressZipCode" : myElement =paymentAddressZipCode; break;
            case "payeePhoneNumber" : myElement =payeePhoneNumber; break;
            case "accountNumber" : myElement =accountNumber; break;
            case "verifyAccountNumber" : myElement =verifyAccountNumber; break;
            case "amount" : myElement =amount; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "register" : myElement =register; break;
            case "registerButton" : myElement =registerButton; break;
            case "loginButton" : myElement =loginButton; break;
            case "sendPaymentButton" : myElement =sendPaymentButton; break;
            case "billPayButton" : myElement =billPayButton; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "successMessage" : myElement =successMessage; break;
            case "loginSuccessMessage" : myElement =loginSuccessMessage; break;
            case "unsuccessfulLoginSuccessMessage" : myElement =unsuccessfulLoginSuccessMessage; break;
            case "paymentCompleteMessage" : myElement =paymentCompleteMessage; break;
        }

        verifyContainsText(myElement,text);
    }















}
