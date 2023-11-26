package trabajoIntegrador.pom.pages;

import org.openqa.selenium.*;


public class ShippingPage {
    private By get_complete_email_place = new By.ByXPath("(//input[@id='customer-email'])[1]");

    private By get_complete_name_place = new By.ByName("firstname");

    private By get_complete_last_name_place = new By.ByName("lastname");

    private By get_complete_company_place = new By.ByName("company");

    private By get_complete_street_place = new By.ByName("street[0]");

    private By get_complete_city_place = new By.ByName("city");

    private By get_complete_province_place = new By.ByName("region");

    private By get_complete_zip_code_place = new By.ByName("postcode");

    private By get_complete_phone_number_place = new By.ByName("telephone");

    private By get_shipping_method_button = new By.ByCssSelector("input[value='flatrate_flatrate']");

    private By get_next_button = new By.ByCssSelector(".button.action.continue.primary");



    public By getGet_complete_email_place() {
        return get_complete_email_place;
    }

    public By getGet_complete_name_place() {
        return get_complete_name_place;
    }
    public By getGet_complete_last_name_place() {
        return get_complete_last_name_place;
    }

    public By getGet_complete_company_place() {
        return get_complete_company_place;
    }

    public By getGet_complete_street_place() {
        return get_complete_street_place;
    }

    public By getGet_complete_city_place() {
        return get_complete_city_place;
    }

    public By getGet_complete_province_place() {
        return get_complete_province_place;
    }

    public By getGet_complete_zip_code_place() {
        return get_complete_zip_code_place;
    }

    public By getGet_complete_phone_number_place() {
        return get_complete_phone_number_place;
    }

    public By getGet_shipping_method_button() {
        return get_shipping_method_button;
    }

    public By getGet_next_button() {
        return get_next_button;
    }
}
