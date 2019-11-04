package tests.mainPage;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, using = "login")
    public WebElement emailAddressInp;

}
