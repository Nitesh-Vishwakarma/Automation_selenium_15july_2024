package Selenium_Project;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_reference_object_repo
{
	public static void main(String[] args) throws Exception
	{

		// Specify the location of configure.properties file
		File src1 = new File("E:\\Selenium java\\eclipse-workspace\\Automation_selenium_15july_2024\\Repository\\configure.properties");
		// Create fileinputstream class object to load the file
		FileInputStream fis1 = new FileInputStream(src1);
		// Create Properties class object to read properties file
		Properties pro1 = new Properties();
		pro1.load(fis1);


		// Specify the location of locators.properties file
		File src2 = new File("E:\\Selenium java\\eclipse-workspace\\Automation_selenium_15july_2024\\Repository\\locators.properties");	
		// Create fileinputstream class object to load the file
		FileInputStream fis2 = new FileInputStream(src2);		
		// Create Properties class object to read properties file
		Properties pro2 = new Properties();
		pro2.load(fis2);


		// Specify the location of Testdata.properties file
		File src3 = new File("E:\\Selenium java\\eclipse-workspace\\Automation_selenium_15july_2024\\Repository\\Testdata.properties");	
		// Create fileinputstream class object to load the file
		FileInputStream fis3 = new FileInputStream(src3);		
		// Create Properties class object to read properties file
		Properties pro3 = new Properties();
		pro2.load(fis3);


		// Setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("url_1"));

		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro2.getProperty("testdata1"));
		driver.findElement(By.xpath(pro2.getProperty("password"))).sendKeys(pro2.getProperty("testdata2"));
		Thread.sleep(200);
		System.out.println("Passed");
		driver.close();

	}
}