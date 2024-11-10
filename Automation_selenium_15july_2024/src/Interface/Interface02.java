package Interface;

public class Interface02 implements Interface01
{
	public void a()
	{
		System.out.println("a method");
	}
	
	public void b()
	{
		System.out.println("b method");
	}
	
	public static void main(String[] args)
	{
		Interface02 i2 = new Interface02();
		i2.a();
		i2.b();
		
	}
}
