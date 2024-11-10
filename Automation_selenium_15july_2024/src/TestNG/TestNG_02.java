package TestNG;

import org.testng.annotations.Test;

public class TestNG_02
{
	// testcases will be execute in Alphanumberic orders
	@Test
	public void a3() {
		System.out.println("Hello a3 test method");
	}
	
	@Test
	public void z() {
		System.out.println("Hello z test method");
	}
	
	@Test
	public void ab() {
		System.out.println("Hello ab test method");
	}
	
	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

}
