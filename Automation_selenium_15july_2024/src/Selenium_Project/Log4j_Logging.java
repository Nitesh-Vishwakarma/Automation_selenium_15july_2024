package Selenium_Project;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j_Logging
{
	public static void main(String[] args)
	{
		// Create Logger Instance
		Logger logger = Logger.getLogger("Log4j_Logging");

		// configure log4j.properties file
		PropertyConfigurator.configure("E:\\Selenium java\\eclipse-workspace\\Automation_selenium_15july_2024\\log4j.properties");

		// Open browser with set property
		// open web browser
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		logger.info("Chrome Browser Opened");

		driver.manage().window().maximize();
		logger.info("Window maximized");

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");

		// Check if element is displayed or not
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("Web element found");
		} catch (Exception e) {
			logger.info("Failure Web element found");
		}
	}

}