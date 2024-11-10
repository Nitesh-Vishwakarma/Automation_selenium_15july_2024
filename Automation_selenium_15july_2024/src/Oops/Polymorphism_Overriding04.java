package Oops;

public class Polymorphism_Overriding04 extends Polymorphism_Overriding03
{
	public void run()
	{
		System.out.println("You are running");
	}
	
	public static void main(String[] args)
	{
		Polymorphism_Overriding04 mo4 = new Polymorphism_Overriding04();
		mo4.run();
		
		Polymorphism_Overriding03 mo3 = new Polymorphism_Overriding03();
		mo3.run();
		
	}

}
