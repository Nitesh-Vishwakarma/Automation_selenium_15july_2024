package Static_Members;

public class Static_class05
{
	static int z = 5; // static variable
	int y = 1; // global variable
	
	//static method
	public static void a()
	{
		z= 10;
		System.out.println(z);
	}
	
	// non static method
	public void b()
	{
		z=15;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		System.out.println(z);
		a();
		Static_class05 s5 = new Static_class05();
		s5.b();
		
	}
}
