package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_01
{
	@Test
	public void testcase01() {
		System.out.println("testcase01 executed successfully");
	}

	@Test
	public void testcase02() {
		System.out.println("testcase02 executed successfully");
	}

	@Test
	public void testcase03() {
		System.out.println("testcase03 executed successfully");
	}

	@BeforeTest
	public void before_test() {
		System.out.println("before_test executed successfully");
	}

	@AfterTest
	public void after_test() {
		System.out.println("after_test executed successfully");
	}

	@BeforeSuite
	public void before_suite() {
		System.out.println("before_suite executed successfully");
	}

	@AfterSuite
	public void after_suite() {
		System.out.println("after_suite executed successfully");
	}

	@AfterMethod
	public void after_method() {
		System.out.println("after_method executed successfully");
	}

	@BeforeMethod
	public void before_method() {
		System.out.println("before_method executed successfully");
	}

	@BeforeClass
	public void before_class() {
		System.out.println("before_class executed successfully");
	}

	@AfterClass
	public void after_class() {
		System.out.println("after_class executed successfully");
	}

}
