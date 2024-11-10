package Oops;

public class Inheritance_multi_level03 extends Inheritance_multi_level02
	{
		public void speak()
		{
			System.out.println("I am speaking");
		}

		public static void main(String[] args)
		{
			Inheritance_multi_level03 i5= new Inheritance_multi_level03();
			i5.write();
			i5.read();
			i5.speak();
			
		}
	}
