package Exceptional_handling;

public class Exceptional_handling_TryAndCatch04
{
	public static void main(String[] args) {
		int a[]= new int [5];
		
			try {
				a[7] = 50;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Exception Handled");
	}
}
