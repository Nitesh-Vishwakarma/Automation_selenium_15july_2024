package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_simulation03
{
	public static void main(String[] args) throws Exception
	{
		// Setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

		// Switch to frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");

		// drag web element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		// drag element to an specific path
		Thread.sleep(200);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 300, 60).build().perform();
		System.out.println("Element drag successfully");
	}

}
