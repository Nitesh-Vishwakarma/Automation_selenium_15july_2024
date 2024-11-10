package Type_Casting;

public class Type_Casting_Narrowing01
{
	public static void main(String[] args)
	{
		// Double to Integer conversion
		double b = 5.9;
		int a = (int) b; // Manual Casting
		System.out.println(b); // 5.9
		System.out.println(a); // 5
		
		// String to Integer conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i); // 10
		
		// Integer to String Conversion
		int z= 5;
		String t = String.valueOf(z);
		System.out.println(t.length()); // 1
		System.out.println(t); // 5
		
	}

}
