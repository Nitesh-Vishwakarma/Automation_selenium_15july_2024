package Oops;

public abstract class Abstraction01
{
	static int a= 5; //static variable
	int b = 5; // global variable
	final int c= 10; // final variable
	
	//abstract method have no body
	abstract void eat();
	
	// Non-abstract method
	public void a()
	{
		System.out.println("Non-Abstract Method");
	}
}
