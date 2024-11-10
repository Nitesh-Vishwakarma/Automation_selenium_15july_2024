package Constructor;

public class Constructor_overloading01
{
	// Constructor overloading
	Constructor_overloading01()
	{
		System.out.println("No perameter");
	}
	
	Constructor_overloading01(int s)
	{
		System.out.println("int parameter");
	}
	
	Constructor_overloading01(String s)
	{
		System.out.println("String Parameter");
	}
	
	public static void main(String[] args)
	{
		Constructor_overloading01 c1 = new Constructor_overloading01();
		Constructor_overloading01 c2 = new Constructor_overloading01(1);
		Constructor_overloading01 c3 = new Constructor_overloading01("nitesh");
		
	}

}
