package map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {


	
	public static void main(String args[])
	{
	
	LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
	
	
	lhm.put(2,"bbb");
	lhm.put(3,"abc");
	lhm.put(5,"bcd");
	lhm.put(1,"aaa");
	lhm.put(4,"abba");
	lhm.put(4,"baab");
	lhm.put(4,"cabc");
	
	lhm.put(null, null);
	
	
	System.out.println(lhm);
	
	
	}

	
}
