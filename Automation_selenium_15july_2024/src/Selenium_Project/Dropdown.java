package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(200);

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click(); // click on "Sign up for Facebook" button
		Thread.sleep(200);
		System.out.println(driver.getCurrentUrl());

		// Drowdown date
		//1st way by index value
		List<WebElement> birthdate = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("Total dropdown value :" + birthdate.size());
		birthdate.get(17).click(); //18
		Thread.sleep(200);
		birthdate.get(15).click(); //16

		//2nd way by value
		WebElement bd = driver.findElement(By.xpath("//select[@id='day']"));
		Select date = new Select(bd);
		Thread.sleep(200);
		date.selectByVisibleText("18"); //18
		Thread.sleep(200);
		date.selectByVisibleText("16"); //16
		Thread.sleep(200);
		date.selectByVisibleText("31"); //31
		System.out.println(date.getFirstSelectedOption().getText());

		//3rd way
		WebElement bday = driver.findElement(By.xpath("//select[@id='day']"));
		Select bdate = new Select(bday);
		List<WebElement> dropdown = bdate.getOptions();
		System.out.println(dropdown.size());
		for (int i=0; i< dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("18"))
			{
				dropdown.get(i).click();
			}
		}

		//4th way set direct with sendkeys
		Thread.sleep(200);
		WebElement bd01= driver.findElement(By.xpath("//select[@id='day']"));
		bd01.sendKeys("16");

		// 5th way
		WebElement birthd = driver.findElement(By.xpath("//select[@id='day']"));
		Select birth01 = new Select(birthd);
		driver.findElement(By.id("day")).sendKeys("16");
		System.out.println(birth01.isMultiple()); //false
		birth01.selectByVisibleText("16"); //16
		birth01.selectByValue("18");
		birth01.selectByIndex(17);

		// Diselect the multiple selected value from dropdown (here is no option for deselect)

		birth01.deselectByVisibleText("16");
		birth01.deselectByValue("18");
		birth01.deselectByIndex(17);
		birth01.deselectAll();
	}
}