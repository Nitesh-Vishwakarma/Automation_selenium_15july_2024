package Exceptional_handling;

public class Exceptional_handling_TryAndCatch02
{
	public static void main(String[] args)
	{
		String s = null;
	
		try {
			System.out.println(s.length());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}

}
