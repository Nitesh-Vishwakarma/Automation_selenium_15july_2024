package Operators;

public class Unary_operator03 {
	
	public static void main(String[] args) {
		
		int a=10; // Local Variable defining
		int b=10; // Local Variable defining
		
		System.out.println(a); // 10
		System.out.println(a++); // 10 but a value increase to 11 after execution of this line
		System.out.println(a++ + ++a); // 11 + 13 = 24
		System.out.println(a + a++); // 13 + 13 = 26
		System.out.println(a); // 14
		
		System.out.println(b++ + b--); // 10 + 11 = 21
		System.out.println(b++ + b--); // 10 + 11 = 21
		System.out.println(b); // 10
		
		System.out.println(a++ + b++); // 24
		System.out.println(a + b); // 26
		
	}
	
	

}
