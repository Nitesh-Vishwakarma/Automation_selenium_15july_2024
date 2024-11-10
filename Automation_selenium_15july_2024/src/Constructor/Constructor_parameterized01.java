package Constructor;

public class Constructor_parameterized01
{
	int id; // global variable
	String name; // global variable
	String address; // global variable
	
	// Default Constructor
	Constructor_parameterized01()
	{
		System.out.println("Hello Default constructor");
	}
	
	// Parameterized Constructor
	Constructor_parameterized01(int a, String b, String c)
	{
		this.id = a;
		name = b;
		address = c;
	}
	
	// Non static method 
	public void displayinfo()
	{
		System.out.println(id + "  " + name + "  " + address);
	}
	
	public static void main(String[] args)
	{
		// Default Constructor
		Constructor_parameterized01 c1 = new Constructor_parameterized01();
		
		// Parameterized Constructor
		Constructor_parameterized01 c2 = new Constructor_parameterized01(1, "John", "UK");
		c2.displayinfo();
		
		Constructor_parameterized01 c3 = new Constructor_parameterized01(2, "Peter", "UK");
		c2.displayinfo();
	}
	

}
