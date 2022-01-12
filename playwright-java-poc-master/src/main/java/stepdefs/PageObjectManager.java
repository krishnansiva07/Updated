package stepdefs;

import com.microsoft.playwright.Page;
import pageobjects.AuthPage;
import pageobjects.LandingPage;


public class PageObjectManager {

    private LandingPage landingPage;
    private AuthPage authPage;

    public PageObjectManager(Page page) {
        this.landingPage = new LandingPage(page);
        this.authPage = new AuthPage(page);
    }

    public LandingPage getLandingPage() {
        return landingPage;
    }

    public AuthPage getAuthPage() {
        return authPage;
    }
}
