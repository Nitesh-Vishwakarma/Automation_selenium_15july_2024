package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_05
{
	@Test
	public void a() {
		System.out.println("Hello a test method");
	}
	
	@Test (invocationCount = 2, priority = -1, enabled = false & true)
	public void b() {
		System.out.println("Hello b test method");
	}
	
	@Test (invocationCount = 2)
	public void c() {
		System.out.println("Hello c test method");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("Hello d test method");
	}
}
