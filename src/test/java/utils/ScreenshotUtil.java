package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String testName) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File("screenshots/" + testName + ".png");

            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot Captured");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}