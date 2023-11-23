package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import trabajoIntegrador.DriverActions;

import java.util.List;

import static trabajoIntegrador.DriverManager.driver;

public class RadiantTeePage {

private By select_size = new By.ByCssSelector ("#option-label-size-143-item-169");

private By select_color = new By.ByXPath("//div[@id='option-label-color-93-item-50']");

private By select_quantity = new By.ById("qty");

private By add_to_cart_button = new By.ById("product-addtocart-button");



    public By getSelect_size() {
        return select_size;
    }

    public By getSelect_color() {
        return select_color;
    }

    public By getSelect_quantity() {
        return select_quantity;
    }

    public By getAdd_to_cart_button() {
        return add_to_cart_button;
    }
}
