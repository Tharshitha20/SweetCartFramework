package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    By loginButton = By.linkText("Login");

    public void clickLoginButton() {

        driver.findElement(loginButton).click();
    }
}