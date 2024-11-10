package Variable;
public class Variable08
{
	int b= 10; //global variable
	static int c= 5; //static variable
	
	public static void main(String[] args) {
		int a= 6; //local variable
		System.out.println(a); //6- calling local variable
		
		// static member calling
		System.out.println(c);
		d();
		
		// Non static member calling
		Variable08 v8= new Variable08();
		System.out.println(v8.b);
		v8.f();	
		}
	
	//static method
	public static void d() {
		int e= 15; //local variable
		System.out.println(e);
	}
	
	// Non Static method
	public void f() {
		int g= 5; //local variiable
		System.out.println(g);
	}
}
