package tests.search;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BasePage {
    @FindBy(how = How.ID, using = "search_query_top")
    WebElement search;

    @FindBy(how = How.NAME, using = "submit_search")
    WebElement searchBtn;
}
