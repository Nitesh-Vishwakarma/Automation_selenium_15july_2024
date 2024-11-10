package facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class Common_Method extends Master_Page
{
	public Common_Method() throws Exception {
		super();
	}

	// Get text to Web Element
	public void getWebElementText(String xpathkey) {
		String getTextOfWebElement = driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(getTextOfWebElement);
	}

	// Click Method
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	// Clear Method
	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}

	// Enter data
	public void enterData(String xpathkey, String testdata) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}

	// Mouser hover
	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}

	// Click List of Web element
	public void clickListElement(String xpathkey, String testdata) {
		List<WebElement> listOfElement = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for (int i=0; i< listOfElement.size(); i++) {
			if (listOfElement.get(i).getText().equalsIgnoreCase(or.getProperty(xpathkey))); {
				listOfElement.get(i).click();
			}
		}
	}

	// Select dropdown value using visible text
	public void selectdropdownvalue(String xpathkey, String testdata) {
		WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(td.getProperty(testdata));
	}

	// Read Excel file data
	public void readExcelData(String xpathkey, int rowNo, int columnNo) throws Exception {
		File src = new File(".\\src\\facebook.resources\\Practice.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(prop.getProperty("Practice"));
		System.out.println(sh.getSheetName());
		String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(abc);
	}
	
	// Handling Explicit wait - visibilityOfElementLocated
	public void handleExplicitWait_visibilityofElementLocated(String xpathkey, String testdata) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(or.getProperty(xpathkey)))).sendKeys(td.getProperty(testdata));
	}

	// Handling log File
	public void handleLogger(String logClassName, String loggerText) {
		Logger logger = Logger.getLogger(logClassName);
		PropertyConfigurator.configure(prop.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}

	// Capture Screenshot
	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destFolder = new File("./screenshot/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured");
		}
	}
}