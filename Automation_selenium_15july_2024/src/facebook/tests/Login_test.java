package facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import facebook.Pages.Login_Page;
import facebook.genericPage.Master_Page;

public class Login_test {
	
	@Test
	public void logintest() throws Exception {
		Login_Page lp = new Login_Page();
		
		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		lp.getfacebooktext();
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearPassword();
		Thread.sleep(2000);
		lp.readExcelData("EmailOrPhone",0, 0);
		Thread.sleep(2000);
		lp.readExcelData("Password", 1, 0);
	}
	
	@AfterMethod
	public void takesScreenshot(ITestResult result2) throws Exception {
		Login_Page lp = new Login_Page();
		lp.captureScreenshot(result2);
	}
	
	@AfterClass
	public static void closeLoginPage() {
		Master_Page.driver.close();
	}
}