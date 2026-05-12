package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginPageTest() {

        driver.findElement(By.linkText("Login")).click();

        WebElement email =
                driver.findElement(By.id("exampleInputEmail"));

        WebElement password =
                driver.findElement(By.id("exampleInputPassword"));

        email.sendKeys("test@user.com");
        password.sendKeys("Test@123");

        Assert.assertTrue(email.isDisplayed());
        Assert.assertTrue(password.isDisplayed());

        System.out.println("Login Page Test Passed");
    }
}