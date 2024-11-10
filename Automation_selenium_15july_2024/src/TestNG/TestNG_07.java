package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_07
{
		WebDriver driver;

		@BeforeClass
		public void setEnv() {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://wwww.facebook.com/");
		}

		@DataProvider
		public Object[][] dataSet() throws Exception {
			// Specify the location of properties file
			File src3 = new File("E:\\Selenium java\\eclipse-workspace\\Automation_selenium_15july_2024\\Repository\\Testdata.properties");
			FileInputStream fis3 = new FileInputStream(src3);
			Properties pro3 = new Properties();
			pro3.load(fis3);

			Object arr[][] = new Object[3][2];
			arr[0][0] = pro3.getProperty("testdata1");
			arr[0][1] = pro3.getProperty("testdata2");

			arr[1][0] = "testdata2";
			arr[1][0] = "testdata2";

			arr[2][0] = "testdata3";
			arr[2][0] = "testdata3";
			return arr;
		}

		@Test(dataProvider = "dataSet")
		public void enterdata(String userName, String password) throws Exception {
			Thread.sleep(200);
			driver.findElement(By.id("email")).clear();
			Thread.sleep(200);
			driver.findElement(By.id("pass")).clear();
			Thread.sleep(200);
			driver.findElement(By.id("email")).sendKeys(userName);
			Thread.sleep(200);
			driver.findElement(By.id("pass")).sendKeys(password);
			Thread.sleep(200);	
		}
	}