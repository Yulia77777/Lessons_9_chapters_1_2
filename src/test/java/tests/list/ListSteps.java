package tests.list;

public class ListSteps {
    private ListPage list = new ListPage();

    public void submitMandatoryFields() {

        list.click(list.listIcn);
        list.click(list.addCartBtn);
        list.click(list.checkoutBtn);
    }
}
