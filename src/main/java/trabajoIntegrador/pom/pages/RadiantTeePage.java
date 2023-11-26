package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;


public class RadiantTeePage {

private By get_size = new By.ByCssSelector ("#option-label-size-143-item-169");

private By get_color = new By.ByXPath("//div[@id='option-label-color-93-item-50']");

private By get_quantity = new By.ById("qty");

private By add_to_cart_button = new By.ById("product-addtocart-button");

private By shopping_cart = new By.ByLinkText("shopping cart");



    public By getGet_size() {
        return get_size;
    }

    public By getGet_color() {
        return get_color;
    }

    public By getGet_quantity() {
        return get_quantity;
    }

    public By getShopping_cart() {
        return shopping_cart;
    }

    public By getAdd_to_cart_button() {
        return add_to_cart_button;
    }
}
