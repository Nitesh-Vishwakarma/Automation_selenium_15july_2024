package Selenium_Project;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_excel_file
{
	public static void main(String[] args) throws Exception
	{
		// Specify the location of Excel file
		File src = new File("E:\\Selenium java\\Practice.xlsx");

		// Load file 
		FileInputStream fis = new FileInputStream(src);

		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load Worksheet
		XSSFSheet sheetvalue = wb.getSheet("Zensar_Face to face");

		// Print the loaded sheet name
		System.out.println(sheetvalue.getSheetName());

		// Print 1st value from excel sheet
		System.out.println(sheetvalue.getRow(0).getCell(0).getStringCellValue()); // Questions

		// Print 2nd value from excel sheet
		System.out.println(sheetvalue.getRow(1).getCell(0).getStringCellValue()); // Technical- 1st Round

		// Print integer value from sheet
		System.out.println(sheetvalue.getRow(1).getCell(2).getNumericCellValue());

		// Print total numbers of rows - 1st way
		System.out.println("Total number of rows:" + sheetvalue.getPhysicalNumberOfRows()); // 21

		// Print total numbers of rows - 2nd way
		System.out.println("Total number of rows:" + sheetvalue.getLastRowNum() +1);

		// Print total number of column 1 st way
		System.out.println("Total number of column:" + sheetvalue.getRow(1).getPhysicalNumberOfCells());

		// Print total number of column 2nd way
		System.out.println("Total number of column:" + sheetvalue.getRow(1).getLastCellNum());

		// Real time implementation
		//Setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Enter from excel sheet
		String  username = sheetvalue.getRow(0).getCell(0).getStringCellValue();
		String pass = sheetvalue.getRow(1).getCell(0).getStringCellValue();

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

}
