package trabajoIntegrador.pom.services;

import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.ShoppingCartPage;

public class ShoppingCartService {

    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartService () {

        this.shoppingCartPage = new ShoppingCartPage();
    }

    public void proceedToCheckout () {
        DriverActions.click(this.shoppingCartPage.getGet_proceed_To_Checkout_button());
    }
}