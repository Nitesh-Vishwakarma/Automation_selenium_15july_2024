package Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_facebook {

	public static void main(String[] args) {

		// open web browser
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// open web application
		driver.get("https://www.facebook.com/login/");
	}

}