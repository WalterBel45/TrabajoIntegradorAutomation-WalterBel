package trabajoIntegrador.pom.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.HomePage;

import java.util.List;

import static trabajoIntegrador.DriverManager.driver;

public class HomeService {
private HomePage homepage;

public HomeService() {
   this.homepage = new HomePage();
}

   public void selectItem (String itemName) {
           DriverActions.click(this.homepage.getGet_item_name());
    }
}

