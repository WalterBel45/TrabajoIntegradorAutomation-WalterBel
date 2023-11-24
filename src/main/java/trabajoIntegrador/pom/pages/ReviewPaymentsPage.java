package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class ReviewPaymentsPage {

    private By place_order_button = new By.ByXPath("//button[@title='Place Order']");

    public By getPlace_order_button() {
        return place_order_button;
    }
}
