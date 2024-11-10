package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_simulation02
{
	public static void main(String[] args) throws Exception
	{
		// Setting property of chrome browse
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// Switching frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");

		// Drag web element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		// Drop web element
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		// Drag & drop web element using Actions class
		Thread.sleep(200);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}
}
