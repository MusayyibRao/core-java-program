package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class HashMapDemo {

	
	public static void main(String args[])
	{
		
		HashMap<Integer,String> hm=new HashMap<>();

		hm.put(3, "bbb");
		hm.put(4, "abc");
		hm.put(5, "bcd");
		hm.put(1, "aaa");
		hm.put(2, "bcb");	
		System.out.println(hm);
	
		
System.out.println("-------------------------------------------------------");		

/*
 * in hashMap we can store only one null key and n number of null value    
 */
		
		hm.put(null, null);
		hm.put(6, null);
		hm.put(5, null);
		 
			
		System.out.println(hm);
	
	System.out.println("-----------------------------------------------------------");
	
	
	  
	  System.out.println(hm.get(hm));
	  System.out.println(hm.put(6, "bcde"));
	
	  System.out.println(hm);
	
	
	System.out.println("--------------------------------------------------------");
	
	
	
	/*
	 * in hashMap  we can get elements by using for loop   
	 */
	
	for(int i=0;i<hm.size();i++)
	{
		
		System.out.println(hm.get(i));
		
	}
	System.out.println("----------------------------------------------------------");
	/*
	 * in hashMap  we can get elements by using while loop   
	 */
	
	int va=0;
	while(hm.size()>va)
	{
		
	System.out.println(hm.get(va));
	
	va++;
	}
	
	System.out.println("--------------------------------------------------------");
	
	/*
	 * in hashMap  we can get elements by using for each loop   
	 */	
	
	
	for(Entry<Integer,String> mm:hm.entrySet())
	{
		System.out.println(mm.getKey()+" "+mm.getValue());
		
	}
	
	
System.out.println("--------------------------------------------------------");
	
	/*
	 * in hashMap  we can get elements by using forEach method   
	 */	

  hm.forEach((k,v)->{
	  
	  System.out.println(k+" "+v);
  });
  
  
  System.out.println("-----------------------------------------------------");	  
  
  /*
	 * in hashMap  we can get elements by using  iterator     
	 */	
 
     Iterator<Map.Entry<Integer, String>> itr=hm.entrySet().iterator();
     
        while(itr.hasNext())
        {
        	
        	Map.Entry<Integer, String> itr1= itr.next();
        	
        	System.out.println(itr1.getKey()+" "+itr1.getValue());
        	
        }
        
        
        System.out.println("-------------------------------------------------");
        
        
        
  
  
	}
	
}
