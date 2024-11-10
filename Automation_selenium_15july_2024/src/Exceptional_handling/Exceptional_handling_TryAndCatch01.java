package Exceptional_handling;

public class Exceptional_handling_TryAndCatch01
{
public static void main(String[] args)
	{
		try{
		int a = 5 /0; // Arithmetic Exception
			}
		catch (ArithmeticException a) {
			a.printStackTrace(); // Print complete exception info
			System.out.println(a); // Print only exception info
		}
		catch (NullPointerException n){
			System.err.println(n);
		}
		catch (ArrayIndexOutOfBoundsException b){
			System.out.println(b);
		}
		catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

}
