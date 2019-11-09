package tests.signin;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class SignInPage extends BasePage {

    @FindBy(how = How.ID, using = "email_create")
    WebElement emailAddressInp;

    @FindBy(how = How.ID, using = "SubmitCreate")
    WebElement submitEmailBtn;

}
