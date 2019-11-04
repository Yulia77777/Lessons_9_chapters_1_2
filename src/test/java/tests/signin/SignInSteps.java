package tests.signin;

import tests.mainPage.MainPage;

import static framework.constants.Constants.EMAIL_ID;

public class SignInSteps {
    private MainPage mainPage = new MainPage();

    public void goToRegistration() {
        mainPage.click(mainPage.emailAddressInp);
        enterEmailId();
    }

    public void enterEmailId() {
        SignInPage accPage = new SignInPage();
        accPage.clearAndSendKeys(accPage.emailAddressInp, EMAIL_ID);
        accPage.click(accPage.submitEmailBtn);
    }
}
