package Operators;

public class Logical_and_Bitwise_operator01 {

	public static void main(String[] args) {
		
		int a=10; // Local Variable declaration
		int b=5; // Local Variable declaration
		int c=20; // Local Variable declaration
		
// Logical operator: If 1st condition false then 2nd condition will not be check
		
		System.out.println(a < b && a < c); // false
		System.out.println(a > b && c > b); // true
		System.out.println(a > b && b > c); // false
		System.out.println(a < b && a < c); // false
		
// Bitwise operator: will check both the conditions and output will display
// if true & true = true
// if true & false = false
// if false & true = false
// if false & false = false
		
		System.out.println(a > b & c > b); // true
		System.out.println(a > b & b > c); // false
		System.out.println(a < b & b < c); // false
		System.out.println(a < b & b > c); // false
		

		

	}

}
