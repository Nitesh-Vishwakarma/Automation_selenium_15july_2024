package Java_package02;

public class SecondProgram {
	
	int a= 5; //Global Variable
	static int c= 10; //Static Variable
	
	//Main method: Pre Defined method
	public static void main(String[] args) {
		
		System.out.println("Nitesh");
		System.out.println("Vishwakarma");
		amethod();
		bmethod();
		int d= 12; // Local variable
		System.out.println(d); //Calling a Variable
	}
	public static void amethod() {
		System.out.println("age"); //Calling a Variable
	}
	public static void bmethod() {
		System.out.println("30");
		int b= 9; // Local Variable
		System.out.println(b); // Calling a Variable
		
	}
	

}
