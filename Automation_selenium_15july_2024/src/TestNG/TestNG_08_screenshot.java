package TestNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TestNG_08_screenshot
{

	WebDriver driver;

	// ITestResult will provide us the test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception{

		if (ITestResult.FAILURE == result.getStatus()) {

			// Create reference of TakeScreenshot Interface and type casting\
			TakesScreenshot ts = (TakesScreenshot) driver; // Typecasting of 2 interfaces

			// Use getScreenshotAs() to capture the screenshot in File format
			// getScreenshotAs() method return type = file
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to specific location
			File destFolder = new File("./screenshot/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshpt captured");		
		}
	}
}
