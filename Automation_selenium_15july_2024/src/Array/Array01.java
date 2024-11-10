package Array;

public class Array01
{
	public static void main(String[] args)
	{
		int a[] = new int[5]; // Declaration of array
		System.out.println(a.length); // Printing length of array = 5
		
		// print default value of an integer array
		for (int i=0; i< a.length; i++)
		{
			System.out.println(a[i]);
		}
		// Assigning value to an array
		a[0] = 65;
		a[1] = 99;
		a[2] = 5;
		a[3] = 10; //
		a[4] = 6;
		
		System.out.println(a[3]); // 10
		
		// Print all array elements
		for (int i=0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
