package Loop_conditions;

public class Break_statement04
{

	public static void main(String[] args)
	{
		int i=1; // local variable
		
		// do while loop
		do {
			if (i == 3)
			{
				break;
			}
			System.out.println(i);
			i++;
			}
		while (i<=5);
	}

}
