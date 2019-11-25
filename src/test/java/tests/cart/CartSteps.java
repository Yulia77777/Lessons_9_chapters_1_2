package tests.cart;

import framework.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

class CartSteps {
    private CartPage cartPage = new CartPage();

    void submitMandatoryFields() {

        cartPage.click(cartPage.plusIcn);
        float floatPrice = parseFloatValue(cartPage, cartPage.priceText, "$", "");
        String priceQuatity = cartPage.readAttribute(cartPage.cartQuantText, "value");
        float floatPriceQuat = Float.parseFloat(priceQuatity);
        float checkPrice = floatPrice * floatPriceQuat;
        float totalProduct = parseFloatValue(cartPage, cartPage.totalProdText, "$", "");
        float totalShipping = parseFloatValue(cartPage, cartPage.totalShip, "$", "");
        float total = parseFloatValue(cartPage, cartPage.totalWithoutTaxText, "$", "");
        float tax = parseFloatValue(cartPage, cartPage.totalTaxText, "$", "");
        Float totalSum = parseFloatValue(cartPage, cartPage.totalPriceText, "$", "");
        Assert.assertEquals(checkPrice, totalProduct, 0);
        Assert.assertEquals(totalShipping, 2f, 0);
        float expectedTotal = checkPrice + totalShipping;
        Assert.assertEquals(total, expectedTotal, 0);
        Assert.assertEquals(tax, 0f, 0);
        float expectedTotalSum = floatPrice + totalShipping;
        //Assert.assertEquals(totalSum, expectedTotalSum);        //TODO
        cartPage.click(cartPage.deleteIcn);
        String empty = cartPage.readStrValue(cartPage.checkCartText);
        Assert.assertEquals(empty, "(empty)");
    }

    private float parseFloatValue(BasePage baseElement, WebElement webElement, String replaceStr, String replaceBy) {
        String stringValue = baseElement.readStrValue(webElement);
        String valueAfterReplace = stringValue.replace(replaceStr, replaceBy);
        return Float.parseFloat(valueAfterReplace);
    }

}
