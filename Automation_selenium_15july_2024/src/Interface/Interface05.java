package Interface;

public class Interface05 extends new_class implements Interface03, Interface04
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
		Interface05 i5 = new Interface05();
		i5.a();
		i5.b();
		System.out.println(i5.roll);
	}

}
