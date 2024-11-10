package Oops;

public class Encapulation01
{
	String name; // Global variable
	int b; // Global variable
	final int c =2; // final variable
	
	public void a()
	{
		//c = 5; // final varible can not be updated / modify
	}
	// final method
	final void d()
	{
		System.out.println("Final method");
	}
	
	public void setName(String s)
	{
		this.name =  s;
		this.b = 5;
		System.out.println(b); //5
		System.out.println(c); //2
	}
	
	public String getName()
	{
		return name;
	}

}
