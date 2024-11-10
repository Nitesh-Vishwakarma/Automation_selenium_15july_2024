package facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Master_Page
{
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// Constructor Implementation
	public Master_Page() throws Exception
	{
		// Configuration properties file implementation
		FileInputStream ip= new FileInputStream (".\\src\\facebook\\Repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// locators properties file implementation
		FileInputStream fs= new FileInputStream (".\\src\\facebook\\Repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		// testdata properties file implementation
		FileInputStream ts= new FileInputStream (".\\src\\facebook\\Repository\\testdata.properties");
		td = new Properties();
		td.load(ts);

		// Added latest WebDriver dependency into pom.xml file
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("No browser details founds");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}