package trabajoIntegrador.pom.services;

import org.openqa.selenium.support.ui.ExpectedConditions;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.DriverManager;
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

    public void seeTheOrderCompleted () {
        DriverManager.getWait().until(ExpectedConditions.and(ExpectedConditions.presenceOfElementLocated(this.thankYouPage.getGet_create_an_account_button())));
    }
    public Boolean orderNumberIsANumber() {
        return this.thankYouPage.isNumber(this.thankYouPage.numberExtraction(this.thankYouPage.getGet_order_number_text()));
    }
}
