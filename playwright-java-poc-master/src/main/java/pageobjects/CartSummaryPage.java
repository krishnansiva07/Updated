package pageobjects;

import com.microsoft.playwright.Page;
import stepdefs.Init;


public class CartSummaryPage {

    Page page;

    public CartSummaryPage(Init init) {
        this.page = init.getPage();
    }

    public boolean isCartEmpty() {
        return page.isVisible("//p[contains(text(),'Your shopping cart is empty.')]");
    }
}
