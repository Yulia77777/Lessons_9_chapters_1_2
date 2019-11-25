package tests.newAccount;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class NewAccountSteps {
    private NewAccountPage accnPage = new NewAccountPage();

    @When("^I populate mandatory fields First name \"([^\"]*)\" Last name \"([^\"]*)\" Email \"([^\"]*)\" Password \"([^\"]*)\" First name \"([^\"]*)\" Last name \"([^\"]*)\" Address \"([^\"]*)\" City \"([^\"]*)\" Mobile phone \"([^\"]*)\" Address Alias \"([^\"]*)\"$")
    public void submitMandatoryFields( String firstName, String lastName, String email, String password, String addressfirstName, String addressLastName, String address, String city, String mobilePhone, String addressAlias) {
        accnPage.click(accnPage.mrGenderRad);
        accnPage.clearAndSendKeys(accnPage.firstName, firstName);
        accnPage.clearAndSendKeys(accnPage.lastName, lastName);
        accnPage.clearAndSendKeys(accnPage.email, email);
        accnPage.clearAndSendKeys(accnPage.password, password);
        accnPage.clearAndSendKeys(accnPage.adressFirstName, addressfirstName);
        accnPage.clearAndSendKeys(accnPage.adressLastName, addressLastName);
        accnPage.clearAndSendKeys(accnPage.adress1, address);
        accnPage.clearAndSendKeys(accnPage.city, city);
        accnPage.clearAndSendKeys(accnPage.phone, mobilePhone);
        accnPage.clearAndSendKeys(accnPage.adressAlias, addressAlias);
        accnPage.click(accnPage.submitAccountBtn);
    }

    @Then("^Validation error should display \"([^\"]*)\"$")
    public void checkValidationError(String error){
        String checkError = accnPage.readStrValue (accnPage.validationErrorTxt);
        Assert.assertEquals(checkError, error);
    }
}
