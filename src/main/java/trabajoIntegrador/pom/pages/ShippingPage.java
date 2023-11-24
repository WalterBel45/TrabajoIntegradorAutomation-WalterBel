package trabajoIntegrador.pom.pages;

import org.openqa.selenium.*;


public class ShippingPage {
    private By complete_email = new By.ByXPath("(//input[@id='customer-email'])[1]");

    private By complete_name = new By.ByName("firstname");

    private By complete_last_name = new By.ByName("lastname");

    private By complete_company = new By.ByName("company");

    private By complete_street = new By.ByName("street[0]");

    private By complete_city = new By.ByName("city");

    private By complete_province = new By.ByName("region");

    private By complete_zip_code = new By.ByName("postcode");

    private By complete_phone_number = new By.ByName("telephone");

    private By shipping_method_button = new By.ByCssSelector("input[value='flatrate_flatrate']");

    private By next_button = new By.ByCssSelector(".button.action.continue.primary");



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

    public By getComplete_province() {
        return complete_province;
    }

    public By getComplete_zip_code() {
        return complete_zip_code;
    }

    public By getComplete_phone_number() {
        return complete_phone_number;
    }

    public By getShipping_method_button() {
        return shipping_method_button;
    }

    public By getNext_button() {
        return next_button;
    }
}
