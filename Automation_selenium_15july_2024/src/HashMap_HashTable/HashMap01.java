package HashMap_HashTable;

import java.util.HashMap;

public class HashMap01
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
		
		System.out.println(hm.get(1)); // Jan
		System.out.println(hm.get(2)); // Feb
		System.out.println(hm.get(3)); // Mar
		
		System.out.println(hm); // all values with key
	}

}
