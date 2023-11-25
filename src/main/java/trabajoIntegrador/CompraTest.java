package trabajoIntegrador;

import org.openqa.selenium.support.ui.ExpectedConditions;
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
    public void compraCorrecta () {
        HomeService homeService = new HomeService();
        homeService.selectItem("Radiant Tee");


        RadiantTeeService radiantTeeService = new RadiantTeeService();
        radiantTeeService.choosePreferences();
        radiantTeeService.pressButton();
        radiantTeeService.goToShoppingCart();

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.proceedToCheckout();

        ShippingService shippingService = new ShippingService();
        shippingService.completeInformation();
        shippingService.nextButton();

        CheckoutService checkoutService = new CheckoutService();
        checkoutService.pressPlacerOrderButton();

        ThankYouService thankYouService = new ThankYouService();

        /*Assert.assertTrue(
                thankYouService.getTitle().contains("Thank you for your purchase!"),
                "El title no contiene Thank you for purchase!"
        );

        Assert.assertTrue(
                thankYouService.buttonContinueShoppingIsEnabled(),
                "El boton Continue Shopping no esta habilitado"
        );
        //El boton Back Home esta habilitado.
        Assert.assertTrue(
                thankYouService.buttonCreateAnAccountIsVisible(),
                "El boton Create an account no esta visible"
        ); */
    }


}
