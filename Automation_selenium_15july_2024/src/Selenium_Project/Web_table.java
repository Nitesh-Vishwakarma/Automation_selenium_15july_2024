package Selenium_Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(20);

		// Current list of all companies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies: " + allcompanies.size());

		// Current price of all companies
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current price: " + currentprice.size());

		String ExpResult = "Manoj Ceramic";
		for (int i=0; i< allcompanies.size(); i++)
		{
			if (allcompanies.get(i).getText().equalsIgnoreCase(ExpResult))
			{
				System.out.println(allcompanies.get(i).getText() + " === " + currentprice.get(i).getText());
				allcompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;	
			}
			System.out.println("working");
		}

	}

}
