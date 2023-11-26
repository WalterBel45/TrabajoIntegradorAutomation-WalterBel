package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import trabajoIntegrador.DriverActions;

import static trabajoIntegrador.DriverManager.driver;

public class ThankYouPage {

    private By get_title = new By.ByXPath("//span[@class='base']");

    private By get_continue_shopping_button = new By.ByXPath("//a[@class='action primary continue']");

    private By get_create_an_account_button = new By.ByXPath("//a[@class='action primary']");

    private By get_order_number_text = new By.ByXPath("//div[@class='checkout-success']//p[1]");

    public By getGet_title() {
        return get_title;
    }

    public By getGet_continue_shopping_button() {
        return get_continue_shopping_button;
    }

    public By getGet_create_an_account_button() {
        return get_create_an_account_button;
    }

    public By getGet_order_number_text() {
        return get_order_number_text;
    }

    /*Metodo para extraer la parte numerica del texto Your order # is: ...... y comprobar si es un numero */
    public String numberExtraction (By element) {
        String orderText = DriverActions.getText(element);
        String[] words = orderText.split("\\s+");
        String orderNumber = null;
        for (String word : words) {
            if (word.matches("\\d+\\.?")) {
                orderNumber = word;
                break;
            }
        }
        return orderNumber;
    }
    public boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
