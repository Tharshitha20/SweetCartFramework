package base;

import listeners.TestListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utils.ConfigReader;

@Listeners(TestListener.class)
public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getUrl());
    }

    @Test
    public void homePageTest() {

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        Assert.assertTrue(title.toLowerCase().contains("sweet"));

        System.out.println("Home Page Test Passed");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}