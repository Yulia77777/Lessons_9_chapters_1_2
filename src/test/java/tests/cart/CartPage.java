package tests.cart;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, using = "icon-plus")
    WebElement plusIcn;

    @FindBy(how = How.ID, using = "total_product")
    WebElement totalProdText;

    @FindBy(how = How.ID, using = "total_shipping")
    WebElement totalShip;

    @FindBy(how = How.ID, using = "total_price_without_tax")
    WebElement totalWithoutTaxText;

    @FindBy(how = How.ID, using = "total_tax")
    WebElement totalTaxText;

    @FindBy(how = How.ID, using = "total_price")
    WebElement totalPriceText;

    @FindBy(how = How.CLASS_NAME, using = "icon-trash")
    WebElement deleteIcn;

    @FindBy(how = How.CLASS_NAME, using = "ajax_cart_no_product")
    WebElement checkCartText;

    @FindBy(how = How.XPATH, using = "//td[@data-title='Unit price']")
    WebElement priceText;

    @FindBy(how = How.XPATH, using = "//input[@class='cart_quantity_input form-control grey']")
    WebElement cartQuantText;

}
