package Operators;

public class Unary_operator01
{
	public static void main(String[] args)
	{
		int a=5; // declaring local variable
		
		System.out.println(a); // 5
		System.out.println(a++); // 5 but increase to 6 after execution of this line
		System.out.println(a); // 6
		System.out.println(++a); // 7 increase 1 immediately
		
		System.out.println(a); // 7
		System.out.println(a--); // 7 but decrease to 6 after execution of this line
		System.out.println(a); // 6
		System.out.println(--a); // 5 decrease 1 immediately
	}

}
