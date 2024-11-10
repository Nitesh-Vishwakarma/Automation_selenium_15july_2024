package Static_Members;

public class Static_class03
{
	int roll; // Global Variable defining
	String name; // Global Variable defining
	static String college = "IIT Bombay"; // static Variable defining
	
	// constructor in java
	Static_class03(int r, String n)
	{
		roll= r;
		name= n;
	}
	
	public void getResult()
	{
		System.out.println(roll + "  " + name + "  " + college);
	}
	

}
