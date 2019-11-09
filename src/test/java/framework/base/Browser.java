package framework.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Browser extends BaseTest {

    @Given("^Open browser$")
    public void openBrowserBoundWithCucumber() {
        openBrowser();
    }

    @And("^Close browser$")
    public void closeBrowserBoundWithCucumber() {
        closeBrowser();
    }

}