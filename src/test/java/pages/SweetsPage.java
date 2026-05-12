package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SweetsPage {

    WebDriver driver;

    public SweetsPage(WebDriver driver) {

        this.driver = driver;
    }

    By addToBasketButton =
            By.xpath("(//button)[1]");

    public void addSweetToBasket() {

        driver.findElement(addToBasketButton).click();
    }
}