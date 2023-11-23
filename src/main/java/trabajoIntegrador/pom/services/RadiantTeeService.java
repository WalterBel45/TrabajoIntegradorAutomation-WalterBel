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
    }
}

