package trabajoIntegrador;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import trabajoIntegrador.pom.services.*;

public class CompraTest {

    @BeforeMethod
    public void setup() {
        DriverManager.create("Edge");
        DriverManager.goSite("https://magento.softwaretestingboard.com");
    }

    @Test
    public void correctPurchase () {
        // Entra al navegador en la pagina "https://magento.softwaretestingboard.com y selecciona prenda Radiant Tee"
        HomeService homeService = new HomeService();
        homeService.selectItem();

        // En la pagina de Radiant Tee elige las opciones requeridas, presiona el boton de "Add to cart" y luego en el enlace shopping cart
        RadiantTeeService radiantTeeService = new RadiantTeeService();
        radiantTeeService.choosePreferences();
        radiantTeeService.pressButton();
        radiantTeeService.goToShoppingCart();

        // En la pagina de shopping cart presiona el boton de "proceed to checkout"
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.proceedToCheckout();

        // En la shipping page completa todos los datos que se piden y presiona el boton "Next"
        ShippingService shippingService = new ShippingService();
        shippingService.completeInformation();
        shippingService.pressNextButton();

        // En esta pagina se presiona el boton "place order"
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.pressPlacerOrderButton();

        // Ultima pagina donde se hacen las validaciones
        ThankYouService thankYouService = new ThankYouService();
        thankYouService.seeTheOrderCompleted();


        Assert.assertTrue(
                thankYouService.buttonContinueShoppingIsEnabled(),
                "El boton Continue Shopping no esta habilitado"
        );
        //El boton Back Home esta habilitado.
        Assert.assertTrue(
                thankYouService.buttonCreateAnAccountIsVisible(),
                "El boton Create an account no esta visible"
        );

        Assert.assertTrue(
                thankYouService.getTitle().contains("Thank you for your purchase!"),
                "El title no contiene Thank you for purchase!"
        );

        Assert.assertTrue(thankYouService.orderNumberIsANumber(), "El elemento no es un numero");
    }


}
