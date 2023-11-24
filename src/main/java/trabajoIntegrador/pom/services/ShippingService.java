package trabajoIntegrador.pom.services;

import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.ShippingPage;

public class ShippingService {

    private ShippingPage shippingPage;

    public ShippingService () {
        this.shippingPage = new ShippingPage();
    }

    public void completeInformation () {
        DriverActions.insertText(this.shippingPage.getComplete_email(), "arielbel45@gmail.com");
    }
}
