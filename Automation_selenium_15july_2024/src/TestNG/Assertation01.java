package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertation01
{
	@Test
	public void TC_01() {
	
	String Expected_Text = "Face";
	
	// Setting path of chrome driver
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://wwww.facebook.com/");
	
	String Actual_Text = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText();
	
	// Equal Asseration
	Assert.assertEquals(Actual_Text, Expected_Text);
	System.out.println("Equal Asseration verified");
	
	// False Asseration
	Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isSelected());
	System.out.println("False Asseration verified");
	
	// True Asseration
	Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isDisplayed());
	System.out.println("True Asseration verified");
	
	}
}
