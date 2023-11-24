package trabajoIntegrador.pom.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static trabajoIntegrador.DriverManager.driver;

public class ShippingPage {
    private By complete_email = new By.ByXPath("(//input[@id='customer-email'])[1]");

    private By complete_name = new By.ByName("firstname");

    private By complete_last_name = new By.ByName("lastname");

    private By complete_company = new By.ByName("company");

    private By complete_street = new By.ByName("street[0]");

    private By complete_city = new By.ByName("city");



    public By getComplete_email() {
        return complete_email;
    }

    public By getComplete_name() {
        return complete_name;
    }
    public By getComplete_last_name() {
        return complete_last_name;
    }

    public By getComplete_company() {
        return complete_company;
    }

    public By getComplete_street() {
        return complete_street;
    }

    public By getComplete_city() {
        return complete_city;
    }

}
