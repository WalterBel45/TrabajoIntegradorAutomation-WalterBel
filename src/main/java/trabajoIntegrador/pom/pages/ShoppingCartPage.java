package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class ShoppingCartPage {

    private By get_proceed_To_Checkout_button = new By.ByXPath("//button[@data-role='proceed-to-checkout']");

    public By getGet_proceed_To_Checkout_button() {
        return get_proceed_To_Checkout_button;
    }

}
