package Oops;

public class Polymorphism_Overriding02 extends Polymorphism_Overriding01
{
	public void eat()
	{
		System.out.println("You am eating");
	}
	public static void main(String[] args)
	{
		Polymorphism_Overriding02 mo2 = new Polymorphism_Overriding02();
		mo2.eat();
	}
}
