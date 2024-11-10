package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_inSelenium
{
	public static void main(String[] args) throws Exception
	{
		//Setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		//java Executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//Locato web element using javascript
		jse.executeScript("document.getElementById('email').value='abcd@gmail.com'");
		jse.executeScript("document.getElementsByName('pass')[0].value='abcd'");

		//Scroll down using javascript
		Thread.sleep(5);
		jse.executeScript("window.scrollBy(0, 500)");

		//Scroll up using javascript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, -500)");

		System.out.println("Program is working fine");
	}


}
