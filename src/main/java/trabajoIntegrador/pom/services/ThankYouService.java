package trabajoIntegrador.pom.services;

import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.ThankYouPage;

public class ThankYouService {

    private ThankYouPage thankYouPage;

    public ThankYouService () {
        this.thankYouPage = new ThankYouPage();
    }

    public String getTitle () {
        return DriverActions.getText(this.thankYouPage.getGet_title());
    }

    public Boolean buttonContinueShoppingIsEnabled () {
        return DriverActions.isEnabled(this.thankYouPage.getGet_continue_shopping_button());
    }

    public Boolean buttonCreateAnAccountIsVisible () {
        return DriverActions.isVisible(this.thankYouPage.getGet_create_an_account_button());
    }
}
