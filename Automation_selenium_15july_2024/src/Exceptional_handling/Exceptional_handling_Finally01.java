package Exceptional_handling;

public class Exceptional_handling_Finally01
{
	public static void main(String[] args) {
		
		try {
		int i = 10 / 0;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Exception Handled , finally will always execute.");
		}
	}

}
