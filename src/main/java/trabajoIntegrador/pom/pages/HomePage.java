package trabajoIntegrador.pom.pages;

import org.openqa.selenium.By;

public class HomePage {

    private String urlHomePage = "https://magento.softwaretestingboard.com";

    private By get_item_name = new By.ByCssSelector("a[title='Radiant Tee']");

    public String getUrlHomePage() {
        return urlHomePage;
    }

    public By getGet_item_name() {
        return get_item_name;
    }
}
