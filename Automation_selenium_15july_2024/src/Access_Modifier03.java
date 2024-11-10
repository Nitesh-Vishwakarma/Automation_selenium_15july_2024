import Access_Modifiers.Access_Modifier01;

public class Access_Modifier03 extends Access_Modifier01 {
	
	public static void main(String[] args) {
		
		//System.out.println(Access_Modifier01.a);  //	private static int a = 5;
		
		//System.out.println(Access_Modifier01.b);  // 	static int b = 10;
		
		System.out.println(Access_Modifier01.c);  // 	protected static int c = 5;
		
		System.out.println(Access_Modifier01.d);  // 	public static int d = 7;
	}
}
