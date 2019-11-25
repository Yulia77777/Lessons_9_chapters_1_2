package tests.newAccount;

import framework.base.BaseTest;
import org.junit.Test;
import tests.signin.SignInSteps;

public class NewAccountTest extends BaseTest {

    private SignInSteps signInSteps = new SignInSteps();
    private NewAccountSteps accSteps = new NewAccountSteps();

    @Test
    public void enterAllDataExceptForThreeDropdownBoxesAndParseThreeErrors() {
        signInSteps.goToRegistration();
        //accSteps.submitMandatoryFields();   TODO to refactor, if launched again with TestNG instead of Cucumber
    }
}
