package homePageTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import trabajoIntegrador.DriverManager;
import trabajoIntegrador.pom.services.HomeService;

public class HomePageTests {

    @BeforeMethod
    public void setup() {
        DriverManager.create("edge");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void itemSelectedCorrectly () {
        HomeService homeService = new HomeService();
        homeService.selectItem("Radiant Tee");
    }
}
