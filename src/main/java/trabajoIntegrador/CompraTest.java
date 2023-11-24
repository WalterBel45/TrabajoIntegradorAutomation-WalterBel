package trabajoIntegrador;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import trabajoIntegrador.pom.services.HomeService;
import trabajoIntegrador.pom.services.RadiantTeeService;
import trabajoIntegrador.pom.services.ShippingService;
import trabajoIntegrador.pom.services.ShoppingCartService;

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

    }


}
