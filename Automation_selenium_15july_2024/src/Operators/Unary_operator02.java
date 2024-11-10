package Operators;

public class Unary_operator02
{
	public static void main(String[] args)
	{
		int a=10; // local variable
		int b=10; // local variable
		
		System.out.println(a++); // 10 but increase to 11 after execution of this line
		System.out.println(a); // 11
		System.out.println(a++ + a++); // 11 + 12 = 23
		System.out.println(a); // 13
		
		System.out.println(a++ + ++a); // 13 + 15 = 28
		System.out.println(a); // 15
		
		System.out.println(a + a++); // 30 but a value increase to 16 after execution of this line
		System.out.println(a); // 16
		
		System.out.println(b); // 10
		System.out.println(b++ + b--); // 21
		System.out.println(b); //10
		System.out.println(b++ + b--); // 21
		System.out.println(b); //10
	}

}
