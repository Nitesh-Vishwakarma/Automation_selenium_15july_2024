package Array;

public class Array02 
{
		public static void main(String[] args)
		{
			int b[] = {1, 2, 3, 4, 5}; // Defining integer type array
			
			String s[] = {"Hiee", "hello"}; // Defining string type array
			
			Object obj[] = {1, 2, 3, 5, 5, "Selenium", 6, 6.5}; // Defining object type array
			
			System.out.println(b.length); // 5
			System.out.println(s.length); // 2
			System.out.println(obj.length); // 8
			
			System.out.println(obj[5]); // seleinum
			System.out.println(b[4]); // 5
			System.out.println(s[1]); // Hello
			
			obj[5] = "Automation"; // Modifying value in array index
			System.out.println(obj[5]);
		}

	}
