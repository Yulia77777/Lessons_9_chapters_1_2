package tests.createAccount;

import framework.base.BaseTest;
import org.testng.annotations.Test;
import tests.signin.SignInSteps;

public class NewAccountTest extends BaseTest {

    private SignInSteps signInSteps = new SignInSteps();
    private NewAccountSteps accSteps = new NewAccountSteps();

    @Test
    public void enterAllDataExceptForThreeDropdownBoxesAndParseThreeErrors() {
        signInSteps.goToRegistration();
        accSteps.submitMandatoryFields();
/*        Basket expected = newAccountSteps.editItemsQuantity();
        Basket actual = newAccountSteps.checkOrderAmount();
        Assert.assertEquals(actual, expected);*/
    }
}
