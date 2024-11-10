package Selenium_Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handling02
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// Tab handling using javascript
		Thread.sleep(200);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");

		// Print the title of child window
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);
		Iterator<String> abc1 = allWindowsID.iterator();
		String win2 = abc1.next();
		Thread.sleep(200);
		driver.switchTo().window(win2);
		Thread.sleep(200);
		System.out.println("Child window Id: " + win2); // Alphnumberic value of child window
		System.out.println(driver.getTitle()); // get title of child window
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(200);
		driver.quit(); // close parent window & all associated window
		System.out.println("Window popup & tab handled");
	}
}