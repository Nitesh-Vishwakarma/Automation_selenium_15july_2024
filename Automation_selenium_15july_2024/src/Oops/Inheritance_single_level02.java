package Oops;

public class Inheritance_single_level02 extends Inheritance_single_level01 {
	
	String name = "Selenium"; // Global variable
	
	public static void main(String[] args) {
		
		Inheritance_single_level02 i2 = new Inheritance_single_level02();
		
		System.out.println(i2.roll);
		System.out.println(i2.name);
	}
}