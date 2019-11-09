package tests.newAccount;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class NewAccountPage extends BasePage {

    @FindBy(how = How.ID, using = "id_gender1")
    WebElement mrGenderRad;

    @FindBy(how = How.ID, using = "customer_firstname")
    WebElement firstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    WebElement lastName;

    @FindBy(how = How.ID, using = "email")
    WebElement email;

    @FindBy(how = How.ID, using = "passwd")
    WebElement password;

    @FindBy(how = How.ID, using = "firstname")
    WebElement adressFirstName;

    @FindBy(how = How.ID, using = "lastname")
    WebElement adressLastName;

    @FindBy(how = How.ID, using = "address1")
    WebElement adress1;

    @FindBy(how = How.ID, using = "city")
    WebElement city;

    @FindBy(how = How.ID, using = "phone_mobile")
    WebElement phone;

    @FindBy(how = How.ID, using = "alias")
    WebElement adressAlias;

    @FindBy(how = How.ID, using = "submitAccount")
    WebElement submitAccountBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger']/p")
    WebElement validationErrorTxt;

}
