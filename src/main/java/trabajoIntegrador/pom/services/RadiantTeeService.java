package trabajoIntegrador.pom.services;


import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.RadiantTeePage;




public class RadiantTeeService {

    private RadiantTeePage radiantTeePage;

    public RadiantTeeService() {

        this.radiantTeePage = new RadiantTeePage();
    }

    public void choosePreferences () {

        DriverActions.click(this.radiantTeePage.getSelect_size());
        DriverActions.click(this.radiantTeePage.getSelect_color());
        DriverActions.insertText(this.radiantTeePage.getSelect_quantity(), "2");
    }

    public void pressButton() {
        DriverActions.click(this.radiantTeePage.getAdd_to_cart_button());
    }

    public void goToShoppingCart () {
        DriverActions.click(this.radiantTeePage.getShopping_cart());
    }
}

