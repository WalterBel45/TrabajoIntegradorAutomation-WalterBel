package trabajoIntegrador.pom.services;

import org.openqa.selenium.support.ui.ExpectedConditions;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.DriverManager;
import trabajoIntegrador.pom.pages.CheckoutPage;
import trabajoIntegrador.pom.pages.ThankYouPage;

public class CheckoutService {

    CheckoutPage checkoutPage;

    public CheckoutService () {
        this.checkoutPage = new CheckoutPage();
    }

    public void pressPlacerOrderButton () {
        DriverManager.getWait().until(ExpectedConditions.and (ExpectedConditions.visibilityOfElementLocated(this.checkoutPage.getDetails()),
                ExpectedConditions.presenceOfElementLocated(this.checkoutPage.getDetails())));
        DriverActions.click(this.checkoutPage.getButton_place_order());
    }
}
