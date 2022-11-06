package map;

import java.util.TreeMap;

public class TreeMapDemo {

	
	public static void main(String args[])
	{
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		
		
		tm.put(3, "AA");
		tm.put(4, "BB");
		tm.put(5, "CC");
		tm.put(1, "DD");
		tm.put(2, "EE");
		
		System.out.println(tm);
		
		
		System.out.println("----------------------------------------------------");
		
/*
 * in TreeMap are not allowed null key  but can have n number of null value 		
 */
		//tm.put(null, null);
		
		tm.put(7, null);
		System.out.println(tm);
		
		
	}
	
}
