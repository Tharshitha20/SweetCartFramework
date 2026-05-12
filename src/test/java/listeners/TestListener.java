package listeners;

import base.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed");

        ScreenshotUtil.takeScreenshot(
                BaseTest.driver,
                result.getName());

        System.out.println("Failed Test Name: " + result.getName());
    }
}