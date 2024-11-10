package Selenium_Project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup
{
	public static void main(String[] args) throws Exception
	{
		//Setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		// Accept Alert - Using javascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(200);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");

		// Dismis Alert - Using javascriptExecutor
		Thread.sleep(200);
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(200);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismiss");	
	}
}