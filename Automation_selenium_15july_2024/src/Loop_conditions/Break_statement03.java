package Loop_conditions;

public class Break_statement03 {

	public static void main(String[] args)
	{
		int i =1; // local variable
		
		while (i <= 5)
		{
			if (i == 3)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
