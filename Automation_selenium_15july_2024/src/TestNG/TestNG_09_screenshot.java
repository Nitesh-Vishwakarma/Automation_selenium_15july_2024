package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_09_screenshot
{
	public class TakeScreenshotOnFailure2 {

		TestNG_08_screenshot t1 = new TestNG_08_screenshot();

		@Test
		public void doLogin() {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
			t1.driver = new ChromeDriver();
			t1.driver.manage().window().maximize();
			t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			t1.driver.get("https://wwww.facebook.com/");
			t1.driver.findElement(By.id("email")).sendKeys("12345");

			// Pass wrong id in the password field - test case fail
			t1.driver.findElement(By.id("pass_wrong")).sendKeys("12345");
		}

		@AfterMethod
		public void takeScreenshot(ITestResult result2) throws Exception {
			t1.captureScreenshot(result2);
		}
	}

}
