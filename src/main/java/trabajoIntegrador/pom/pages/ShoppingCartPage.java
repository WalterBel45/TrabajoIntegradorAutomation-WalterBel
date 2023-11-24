package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class ShoppingCartPage {

    private By proceed_To_Checkout = new By.ByXPath("//button[@data-role='proceed-to-checkout']");

    public By getProceed_To_Checkout() {
        return proceed_To_Checkout;
    }

}
