package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homePageTest() {

        String title = driver.getTitle();

        Assert.assertTrue(title.toLowerCase().contains("sweet"));

        System.out.println("Home Page Test Passed");
    }
}