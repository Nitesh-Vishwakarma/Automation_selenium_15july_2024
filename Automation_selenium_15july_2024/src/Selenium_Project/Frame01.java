package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame01
{
	public static void main(String[] args) throws Exception
	{
		// Setting property of chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(200);

		// Find the total number of frame present on web element
		int totalframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames:" + totalframe);

		// Check if element is present or not
		for (int i=0; i< totalframe; i++)
		{
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String ExpText = "Open Paytm App";
			String abc = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			if (abc.equalsIgnoreCase(ExpText))
			{
				System.out.println("Element found");
				break;
			}
			else
			{
				System.out.println("Element not Found");
			}
		}
	}
}
