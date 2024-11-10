package Selenium_Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Implicit
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(20);

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");

		// Handle auto suggestion
		List<WebElement> Suggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (int i= 0; i< Suggestion.size(); i++)
		{
			String ExpResult= "how stuff works science";
			if(Suggestion.get(i).getText().equalsIgnoreCase(ExpResult))
			{
				Suggestion.get(i).click();
				break;
			}
		}
	}
}
