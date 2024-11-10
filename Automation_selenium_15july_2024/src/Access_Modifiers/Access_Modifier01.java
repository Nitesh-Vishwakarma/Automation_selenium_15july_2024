package Access_Modifiers;

public class Access_Modifier01 {

	private static int a = 5;
	static int b = 10;
	protected static int c = 5;
	public static int d = 7;
	
	public static void main(String[] args) {
		
		System.out.println(Access_Modifier01.a);  //	private static int a = 5;
		
		System.out.println(Access_Modifier01.b);  // 	static int b = 10;
		
		System.out.println(Access_Modifier01.c);  // 	protected static int c = 5;
		
		System.out.println(Access_Modifier01.d);  // 	public static int d = 7;
	}

}
