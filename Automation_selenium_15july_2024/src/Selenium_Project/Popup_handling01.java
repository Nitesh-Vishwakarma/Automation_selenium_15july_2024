package Selenium_Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handling01 {

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
		jse.executeScript("document.getElementById('tabButton').click()");

		// get total number of open tab/ windows
		Set<String> alltabID = driver.getWindowHandles();
		System.out.println(alltabID);
		Iterator<String> abc = alltabID.iterator();
		String tab1 = abc.next();
		String tab2 = abc.next();

		// Print the title of parent window tab
		driver.switchTo().window(tab1);
		System.out.println("Parent Window tab ID :" + tab1); // Alphanumberic ID of parent window
		System.out.println(driver.getTitle());

		// Print current url of child window tab
		Thread.sleep(200);
		driver.switchTo().window(tab2);
		Thread.sleep(200);
		System.out.println("Child Window tab  ID: " + tab2); // Alphnumberic value of child window tab
		System.err.println(driver.getCurrentUrl()); // current url of child tab
		driver.close();	
	}
}

