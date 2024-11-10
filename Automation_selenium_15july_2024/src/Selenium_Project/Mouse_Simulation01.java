package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Simulation01
{
	public static void main(String[] args) throws Exception
	{
		// Setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/plus");

		// Create Electronic Web element ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Mouse simulation using Action class
		Actions act = new Actions(driver);

		// Mouse hover on electronics 
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		driver.findElement(By.xpath("//*[text()='Samsung']")).click();

		// Keyboard Simulation
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men is clicked");

		// Right click on web page
		Thread.sleep(2000);
		act.contextClick().build().perform();

	}

}
