package Oops;

public class Encapulation02 extends Encapulation01
{
	// final method can not be override
	/*
	final void d()
	{
		System.out.println("final method");
	}
	*/
	public static void main(String[] args)
	{
		Encapulation02 e2 = new Encapulation02();
		e2.setName("Selenium");
		System.out.println(e2.getName());
	}

}
