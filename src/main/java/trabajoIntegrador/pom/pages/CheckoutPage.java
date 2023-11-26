package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class CheckoutPage {

    private By get_place_order_button = new By.ByXPath("//button[@title='Place Order']");

    private By get_details = new By.ByXPath("//div[@class='billing-address-details']");

    public By getGet_place_order_button() {
        return get_place_order_button;
    }

    public By getGet_details() {
        return get_details;
    }
}
