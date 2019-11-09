package tests.signin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import tests.mainPage.MainPage;


public class SignInSteps {
    private MainPage mainPage = new MainPage();

    @And("^I click on SingIn$")
    public void goToRegistration() {
        mainPage.click(mainPage.emailAddressInp);
    }

    @When("^Create an account Email \"([^\"]*)\"$")
    public void enterEmailId( String email) {
        SignInPage accPage = new SignInPage();
        accPage.clearAndSendKeys(accPage.emailAddressInp, email);
        accPage.click(accPage.submitEmailBtn);
    }
}
