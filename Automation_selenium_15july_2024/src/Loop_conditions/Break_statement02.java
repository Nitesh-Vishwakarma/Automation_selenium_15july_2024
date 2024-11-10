package Loop_conditions;

public class Break_statement02
{

	public static void main(String[] args)
	{
		
		// Outer loop
		for (int i = 1; i < 3; i++)
		{
			//Inner loop
			for (int j = 1; j < 3; j++)
			{
				// if statement
				if (i == 2 && j == 2)
				{
					break;
				}
				
				System.out.println(i+ "  " + j);
			}
			System.out.println("control came out from inner loop");
		}
		System.out.println("control came out from outer loop");
	}

}
