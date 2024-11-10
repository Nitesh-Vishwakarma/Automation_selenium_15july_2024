package Exceptional_handling;

public class Exceptional_handling_Finally02 {

	public static void main(String[] args) {
		
		try {
			int i= 20 /2;
		} finally {
			System.out.println("finally will execute always.");
			
		try {
			int a = 5/ 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		System.out.println("Exception Handled");
	}
}
