package Variable;

public class Variable01 
{
	public static void main(String[] args)
	{
		int a= 5; // int type local variable
		System.out.println(a); // 5 calling a variable
		
		int x= 100; // int type local variable
		System.out.println(x); //100
		
		x= 200; // modification of value
		System.out.println(x); //200
		
		char c= 'a'; // char type local variable, should be placed inside the single quotes
		System.out.println(c); //a
		
		boolean b= true;
		System.out.println(b); // true
		
		b= false; // modification of value
		System.out.println(b); // false
		
		System.out.println(3>12); // false
		
		int e= 100;
		int f= 200;
		System.out.println(f>e); // true
		System.out.println(e>f); // false
	}
}