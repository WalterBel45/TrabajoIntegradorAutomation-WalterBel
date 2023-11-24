package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class ShippingPage {
    private By complete_email = new By.ByXPath("(//input[@id='customer-email'])[1]");

    public By getComplete_email() {
        return complete_email;
    }
}
