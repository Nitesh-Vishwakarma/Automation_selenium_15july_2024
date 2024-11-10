package Operators;

public class Relation_operator02 {

	public static void main(String[] args) {
		
		String a = "HELLO";
		String b = "hello";
		
// String comparison: 1st way Case sensitive
		if (a == b) {
			System.out.println("a and b are equal for 1st way");
		}
		else {
			System.out.println("a and b are not equal for 1st way");
		}
		
// String comparison: 2st way Case sensitive
		if (a.equals(b)) {
			System.out.println("a and b are equal for 2nd way");
				}
		else {
			System.out.println("a and b are not equal for 2nd way");
			}

// String comparison: 3rd way Case sensitive
		if (a.equalsIgnoreCase(b)) {
			System.out.println("a and b are equal for 3rd way");
				}
		else {
			System.out.println("a and b are not equal for 3rd way");
				}
	}

}
