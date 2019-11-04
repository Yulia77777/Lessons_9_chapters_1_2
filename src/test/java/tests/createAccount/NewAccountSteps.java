package tests.createAccount;

import static framework.constants.Constants.EMAIL_ID;

public class NewAccountSteps {
    private NewAccountPage accnPage = new NewAccountPage();


    public void submitMandatoryFields() {
        accnPage.click(accnPage.mrGenderRad);
        accnPage.clearAndSendKeys(accnPage.firstName, "Yliia");
        accnPage.clearAndSendKeys(accnPage.lastName, "Vorobiova");
        accnPage.clearAndSendKeys(accnPage.email, "yuliia.vorobiova@ctdev.io");
        accnPage.clearAndSendKeys(accnPage.password, "11111");
        accnPage.clearAndSendKeys(accnPage.adressFirstName, "Yliia");
        accnPage.clearAndSendKeys(accnPage.adressLastName, "Vorobiova");
        accnPage.clearAndSendKeys(accnPage.adress1, "Melnikova 32, Felix dewr");
        accnPage.clearAndSendKeys(accnPage.city, "Kiev");
        accnPage.clearAndSendKeys(accnPage.phone, "380980000000");
        accnPage.clearAndSendKeys(accnPage.adressAlias, "Malinovskogo 12");
        accnPage.click(accnPage.submitAccountBtn);

    }
}
