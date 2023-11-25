package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class CheckoutPage {

    private By button_place_order = new By.ByXPath("//button[@title='Place Order']");

    private By details = new By.ByXPath("//div[@class='billing-address-details']");

    public By getButton_place_order() {
        return button_place_order;
    }

    public By getDetails() {
        return details;
    }
}
