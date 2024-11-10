package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrray_List01 {

	public static void main(String[] args)
	{
		// Creating array list
		ArrayList<Object> obj = new ArrayList<Object>();
		
		//Adding object in ArrayList
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');
		obj.add(3>12);
		
		//Print ArrayList Element 1st way
		System.out.println(obj);
		
		//Print ArrayList Element 2nd way
		for (Object bcd : obj) {
			System.out.println("For each loop:" + bcd);
		}
		//Print ArrayList Element 2nd way
		Iterator abc = obj.iterator();
		while (abc.hasNext()) {
			System.out.println("while loop: " + abc.next());
		}
		
		
	}

}
