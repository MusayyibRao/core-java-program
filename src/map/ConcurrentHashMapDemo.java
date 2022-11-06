package map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	
	public static void main(String args[])
	{
		
	 // ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();	
	  
		HashMap<Integer,String> chm=new HashMap<>();	
			
	 
	  
	  chm.put(3, "abc");
	  chm.put(2, "ab");
	  chm.put(1, "bcd");
	  chm.put(4, "bb");
	  
	  chm.putIfAbsent(5, "cc");
	  chm.putIfAbsent(1,"abb");
	  chm.remove(1,"D");
	  chm.replace(2,"ab","abcde");
	  
	  System.out.println(chm);
	}
}
