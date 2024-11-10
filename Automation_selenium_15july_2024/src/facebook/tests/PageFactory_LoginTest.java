package facebook.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import facebook.Pages.PageFactory_LoginPage;
import facebook.genericPage.Common_Method;

public class PageFactory_LoginTest extends Common_Method {

	public PageFactory_LoginTest() throws Exception {
		super();
	}
	
	@Test
	public void logintest() {
		PageFactory_LoginPage pfc = PageFactory.initElements(driver, PageFactory_LoginPage.class);
		pfc.enterEmail();
		pfc.enterPassword();
	}
	
	
	
}
