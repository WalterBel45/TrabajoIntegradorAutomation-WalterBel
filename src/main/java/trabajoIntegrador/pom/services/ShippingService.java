package trabajoIntegrador.pom.services;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.pom.pages.ShippingPage;

import static trabajoIntegrador.DriverManager.driver;

public class ShippingService {

    private ShippingPage shippingPage;

    public ShippingService () {
        this.shippingPage = new ShippingPage();
    }

    public void completeInformation () {
        DriverActions.insertText(this.shippingPage.getComplete_email(), "arielbel45@gmail.com");
        DriverActions.insertText(this.shippingPage.getComplete_name(), "Walter Ariel");
        DriverActions.insertText(this.shippingPage.getComplete_last_name(), "Bel");
        DriverActions.insertText(this.shippingPage.getComplete_company(), "-");
        DriverActions.insertText(this.shippingPage.getComplete_street(), "Villaguay Oeste 2209");
        DriverActions.insertText(this.shippingPage.getComplete_city(), "Concordia");

        /* No supe como meter el select en la ShippingPage */
        Select selectCountry = new Select(driver.findElement(By.name("country_id")));
        selectCountry.selectByValue("AR");

        DriverActions.insertText(this.shippingPage.getComplete_province(), "Entre Rios");
        DriverActions.insertText(this.shippingPage.getComplete_zip_code(), "3200");
        DriverActions.insertText(this.shippingPage.getComplete_phone_number(), "+543454942931");
        DriverActions.click(this.shippingPage.getShipping_method_button());
    }
public void nextButton () {
        DriverActions.click(this.shippingPage.getNext_button());
    }
}
