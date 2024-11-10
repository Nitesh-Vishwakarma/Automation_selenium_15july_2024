package Array;

public class MultiDimen_Array01
{
	public static void main(String[] args)
	{
		// Defining Multi Dimensional array
		int a[][]= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		
		// Total numbers of rows
		int rows = a.length; // 3
		System.out.println(rows);
		
		//Total number of columns
		int columns = a[0].length;
		System.out.println(columns); //4
		
		//Print all the values in matrix form
		
		//Outer loop
		for (int i=0; i< rows; i++)
		{
			//inner loop
			for (int j=0; j< columns; j++)
			{
				System.out.print(a[i][j]+ "  ");
			}
		System.out.println();
		}
	}

}
