package Conditional_statement;

public class nested_if_statement
{

	public static void main(String[] args)
	{
		int age = 15; //Defining local variable
		int weight = 55; //Defining local varible
		
		// Outer if condition
		if (age > 10) {
			
		// Inner if condition
		if (weight > 50) {
			System.out.println("Eligible");}
		
		else {
			System.out.println("Not Eligible");}
	}
		else {
			System.out.println("age is not less than 15");}
	
	
	}

}
