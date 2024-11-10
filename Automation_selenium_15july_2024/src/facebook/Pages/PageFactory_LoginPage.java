package facebook.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory_LoginPage {
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement EmailOrPhone;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement Password;
	
	public void enterEmail() {
		EmailOrPhone.sendKeys("abc@gmail.com");
	}
	
	public void enterPassword() {
		Password.sendKeys("Nitesh");
	}
}