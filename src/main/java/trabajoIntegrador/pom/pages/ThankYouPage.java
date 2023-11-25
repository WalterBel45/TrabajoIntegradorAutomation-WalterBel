package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class ThankYouPage {

    private By get_title = new By.ByXPath("//span[@class='base']");

    private By get_continue_shopping_button = new By.ByXPath("//a[@class='action primary continue']");

    private By get_create_an_account_button = new By.ByXPath("//a[@class='action primary']");

    public By getGet_title() {
        return get_title;
    }

    public By getGet_continue_shopping_button() {
        return get_continue_shopping_button;
    }

    public By getGet_create_an_account_button() {
        return get_create_an_account_button;
    }
}
