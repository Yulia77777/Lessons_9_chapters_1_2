package framework.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

public class BasePage {
    protected WebDriver driver = Driver.getInstance();

    public BasePage() {
        PageFactory.initElements(new HtmlElementDecorator(driver), this);
    }

    private void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public String readStrValue(WebElement webElement) {
        waitForVisibility(webElement);
        String result = webElement.getText();
        return result;
    }

    public String readAttribute(WebElement webElement, String attributeName) {
        waitForVisibility(webElement);
        String result = webElement.getAttribute(attributeName);
        return result;
    }

    public void clearAndSendKeys(WebElement input, String value) {
        waitForVisibility(input);
        input.clear();
        input.sendKeys(value);
    }

    public void click(WebElement button) {
        waitForVisibility(button);
        button.click();
    }
}
