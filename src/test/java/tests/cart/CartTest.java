package tests.cart;

import framework.base.BaseTest;
import org.junit.Test;
import tests.list.ListSteps;
import tests.search.SearchSteps;

public class CartTest extends BaseTest {

    private CartSteps cartSteps = new CartSteps();
    private ListSteps listSteps = new ListSteps();
    private SearchSteps searchSteps = new SearchSteps();

    @Test
    public void enterAllDataExceptForThreeDropdownBoxesAndParseThreeErrors() {
        searchSteps.searchBlouse();
        listSteps.submitMandatoryFields();
        cartSteps.submitMandatoryFields();
    }
}
