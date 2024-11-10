package Static_Members;

public class Static_class06
{
	int x = 10; // global variable
	static int y= 5; // static variable

	// Non static method
	public void a()
	{
		int z = 10; // local variable
		System.out.println(z); // 10
	}
	
	static int b= 6; // static variable
	
	// static method
	public static void b()
	{
		int a = 5;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Static_class06 s6= new Static_class06();
		s6.a(); // 10
		System.out.println(b); // 6
		System.out.println(s6.b); //6 - Not appropriate way
		System.out.println(Static_class06.b); //6 - Not appropriate way
		b();
		System.out.println(s6.x);
		System.out.println(y);
		
		
	}

}
