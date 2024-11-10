package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box_and_Radio_button {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		Thread.sleep(200);
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click(); // click on "Sign up for Facebook" button
		Thread.sleep(200);
		System.out.println(driver.getCurrentUrl());

		// 1st way
		driver.findElement(By.xpath("//input[@value=1]")).click(); // female
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@value=2]")).click(); // male
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@value=-1]")).click(); // custom

		// 2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio buttons : " + radios.size());
		System.out.println(radios.get(0).isSelected()); //false
		System.out.println(radios.get(1).isEnabled()); // true
		System.out.println(radios.get(2).isDisplayed()); // true
		Thread.sleep(200);
		radios.get(1).click(); //male
		System.out.println(radios.get(2).isSelected()); // false

		// 3rd way
		List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio buttons Text : " + radiosText.size());
		String ExpResult = "Female";
		for (int i=0; i< radiosText.size(); i++) {
			if (radiosText.get(i).getText().equalsIgnoreCase(ExpResult))
			{
				radiosText.get(i).click();
				System.out.println(ExpResult + "Clicked");
			}
		}
	}
}