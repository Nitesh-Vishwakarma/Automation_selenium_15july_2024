package Exceptional_handling;

public class Exceptional_handling_throw01 {
	
	public static void a(int age) {
		try {
		if (age > 18) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Applicable");
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws NullPointerException, ArrayIndexOutOfBoundsException, Exception {
		
		a(15);
		a(19);
	}

}
