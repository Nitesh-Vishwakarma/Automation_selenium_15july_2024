package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_03
{
	@Test
	public void TC_04()
	{
		String Actual_Text = "ab";
		String Expected_Text = "abc";
		
		// Equal Assertion
		try {
			Assert.assertEquals(Actual_Text, Expected_Text, "Actual and Expected are not matching");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Equal Asseration Verified");
	}
}