package trabajoIntegrador.pom.services;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import trabajoIntegrador.DriverActions;
import trabajoIntegrador.DriverManager;
import trabajoIntegrador.pom.pages.ShippingPage;

import static trabajoIntegrador.DriverManager.driver;

public class ShippingService {

    private ShippingPage shippingPage;

    public ShippingService () {
        this.shippingPage = new ShippingPage();
    }

    public void completeInformation () {
        DriverActions.insertText(this.shippingPage.getGet_complete_email_place(), "arielbel45@gmail.com");
        DriverActions.insertText(this.shippingPage.getGet_complete_name_place(), "Walter Ariel");
        DriverActions.insertText(this.shippingPage.getGet_complete_last_name_place(), "Bel");
        DriverActions.insertText(this.shippingPage.getGet_complete_company_place(), "-");
        DriverActions.insertText(this.shippingPage.getGet_complete_street_place(), "Villaguay Oeste 2209");
        DriverActions.insertText(this.shippingPage.getGet_complete_city_place(), "Concordia");

        /* No supe como meter el select en la ShippingPage */
        Select selectCountry = new Select(driver.findElement(By.name("country_id")));
        selectCountry.selectByValue("AR");

        /* Primero hice que sleccione el Pais aunque la casilla de provincia estaba antes porque al seleccionar Argentina abajo
        cambiaba la forma de introducir la prinvicia, en el caso de Estados Unidos era un select y en el de Argentina solo completar como cualquier
        otro campo anterior */

        DriverActions.insertText(this.shippingPage.getGet_complete_province_place(), "Entre Rios");
        DriverActions.insertText(this.shippingPage.getGet_complete_zip_code_place(), "3200");
        DriverActions.insertText(this.shippingPage.getGet_complete_phone_number_place(), "+543454942931");
        DriverActions.click(this.shippingPage.getGet_shipping_method_button());
    }
public void pressNextButton() {
        DriverActions.click(this.shippingPage.getGet_next_button());
    }
}
