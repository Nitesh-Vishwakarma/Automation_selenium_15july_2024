package Oops;

public class Inheritance_single_level04 extends Inheritance_single_level03
{
	
	public void multiple (int x, int y)
	{
		z = x * y;
		System.out.println(z);
	}
	
	public void divide (int x, int y)
	{
		z = x / y;
		System.out.println(z);
	}
	
	public static void main(String[] args)
	{
		int x = 20;
		int y = 10;
		
		Inheritance_single_level04 i4 = new Inheritance_single_level04();
		
		i4.addition(x,y); // 30
		i4.substraction(x, y); // 10
		i4.multiple(x, y); // 200
		i4.divide(x, y); // 2
	}
}
