package tests.list;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, using = "icon-th-list")
    WebElement listIcn;

    @FindBy(how = How.XPATH, using = "//a[@title='Add to cart']")
    WebElement addCartBtn;

    @FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
    WebElement checkoutBtn;

}
