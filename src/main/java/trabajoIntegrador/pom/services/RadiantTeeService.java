package trabajoIntegrador.pom.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.DriverManager;
import trabajoIntegrador.pom.pages.RadiantTeePage;

import java.util.List;

import static trabajoIntegrador.DriverManager.driver;


public class RadiantTeeService {

    private RadiantTeePage radiantTeePage;

    public RadiantTeeService() {

        this.radiantTeePage = new RadiantTeePage();
    }

    public void choosePreferences () {
        DriverActions.click(this.radiantTeePage.getSelect_size());
    }
}

