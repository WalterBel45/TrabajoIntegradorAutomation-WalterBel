package trabajoIntegrador.pom.services;


import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.HomePage;


public class HomeService {
private HomePage homepage;

public HomeService() {
   this.homepage = new HomePage();
}

   public void selectItem (String itemName) {
           DriverActions.click(this.homepage.getGet_item_name());
    }
}

