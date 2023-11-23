package trabajoIntegrador;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import trabajoIntegrador.pom.pages.HomePage;
import trabajoIntegrador.pom.services.HomeService;
import trabajoIntegrador.pom.services.RadiantTeeService;

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

    }


}
