package pageobjects;

import com.microsoft.playwright.Page;
import stepdefs.Init;


public class ContactUsPage {

    Page page;

    public ContactUsPage(Init init){
        this.page = init.getPage();
    }
}
