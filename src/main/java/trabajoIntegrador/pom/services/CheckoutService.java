package trabajoIntegrador.pom.services;

import org.openqa.selenium.support.ui.ExpectedConditions;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.DriverManager;
import trabajoIntegrador.pom.pages.CheckoutPage;

public class CheckoutService {

    CheckoutPage checkoutPage;

    public CheckoutService () {
        this.checkoutPage = new CheckoutPage();
    }

    public void pressPlacerOrderButton () {
        DriverManager.getWait().until(ExpectedConditions.and (ExpectedConditions.visibilityOfElementLocated(this.checkoutPage.getGet_details()),
                ExpectedConditions.presenceOfElementLocated(this.checkoutPage.getGet_details())));
        DriverActions.click(this.checkoutPage.getGet_place_order_button());
    }
}
