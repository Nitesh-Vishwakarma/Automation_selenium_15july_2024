package Oops;

public class Abstraction02 extends Abstraction01
{
	void eat()
	{
		System.out.println("Please eat");
	}
	
	public static void main(String[] args)
	{
		Abstraction02 ab2 = new Abstraction02();
		ab2.eat();
		ab2.a();
	}
}
