package Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Web_application {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");

		// Launching chrome browser instance
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Open Url using get method

		driver.get("https://www.facebook.com/login/");

		// Wait for page load
		Thread.sleep(20);

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Open Url using navigate method
		driver.navigate().to("https://google.com/");

		// Refresh the page
		driver.navigate().refresh();

		// Navigate to back page
		driver.navigate().back();
		Thread.sleep(20);

		// navigate to forword page
		driver.navigate().forward();

		// Fetch current Url
		System.out.println(driver.getCurrentUrl());

		// Fetch title of current page
		System.out.println(driver.getTitle());

		// Close the instance
		Thread.sleep(20);
		driver.close();

	}

}
