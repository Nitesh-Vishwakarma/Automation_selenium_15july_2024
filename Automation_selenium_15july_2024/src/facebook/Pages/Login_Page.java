package facebook.Pages;

import facebook.genericPage.Common_Method;

public class Login_Page extends Common_Method {

	public Login_Page() throws Exception {
		super();
	}

	// Click Email
	public void clickEmail() {
		clickWebElement("EmailOrPhone");
		handleLogger("LoginPage", "Clicked on Email");
	}

	// Enter Email
	public void enterEmail() {
		enterData("EmailOrPhone", "TestData1");
		handleLogger("LoginPage", "Entered Email");
	}

	// Clear Email
	public void clearEmail() {
		clearData("EmailOrPhone");
		handleLogger("LoginPage", "Cleared Email");
	}

	// Click Password
	public void clickPassword() {
		clickWebElement("Password");
		handleLogger("LoginPage", "Click Password");
	}
	
	// Enter Password
	public void enterPassword() {
		enterData("Password", "TestData2");
		handleLogger("LoginPage", "Entered Password");
	}

	// Clear Password
	public void clearPassword() {
		clearData("Password");
		handleLogger("LoginPage", "Cleared Password");
	}

	// Get facebook text
	public void getfacebooktext() {
		getWebElementText("FacebookText");
		handleLogger("LoginPage", "Fetch Facebook Text");
	}

	// Click Login Button
	public void clickLoginButton() {
		clickWebElement("LoginButton");
		handleLogger("LoginPage", "Click Login Button");
	}
}