package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertation02
{
	@Test
	public void TC_02()
	{
		String Actual_Text = "ab";
		String Expected_Text = "abc";
		
		int a = 10;
		int b = 20;
		
		// Equal Assertion
		Assert.assertEquals(Actual_Text, Expected_Text, "Actual and Expected are not matching");
		System.out.println("Equal Asseration Verified");
		
		// False Asseration
		Assert.assertFalse(a>b);
		System.out.println("False Asseration Verified");
		
		//  True Asseration
		Assert.assertTrue(a>b);
		System.out.println("True asseration verified");
	}
	
	@Test
	public void TC_03()
	{
		// Asseration is written in TC_02() method
		// Scope of asseration will be limited to TC_02 method only
		System.out.println("Hello TC_03 method");
	}
}
