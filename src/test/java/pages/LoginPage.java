package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By loginButton = By.linkText("Login");

    By emailField = By.id("exampleInputEmail");

    By passwordField = By.id("exampleInputPassword");

    By signInButton = By.xpath("(//button)[1]");

    public void clickLoginButton() {

        driver.findElement(loginButton).click();
    }

    public void enterEmail() {

        driver.findElement(emailField)
                .sendKeys("test@user.com");
    }

    public void enterPassword() {

        driver.findElement(passwordField)
                .sendKeys("Test@123");
    }

    public void clickSignIn() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                driver.findElement(signInButton));
    }
}