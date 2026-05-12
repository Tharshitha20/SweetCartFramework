package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BasketTest extends BaseTest {

    @Test
    public void productButtonTest() {

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("Total buttons found: " + buttons.size());

        Assert.assertTrue(buttons.size() > 0);

        System.out.println("Product/Basket Button Verification Passed");
    }
}