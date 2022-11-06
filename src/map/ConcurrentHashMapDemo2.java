package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread{

	
	
	static ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
	
	
	/*
	 * in HashMap   
	 */
	
	
	//static HashMap<Integer,String> chm=new HashMap<>();
	
	public void run()
	{
		
		try {
			
			Thread.sleep(1000);
			
		}
		catch(Exception e) {}
		
		System.out.println("this is child thread");
		
		chm.put(5, "abc");
		
	}
	
	
	
	
	
	public static void main(String args[])throws InterruptedException
	{
		
		chm.put(1, "bbb");
		chm.put(4, "ccc");
		chm.put(2, "ddd");
		
		
		ConcurrentHashMapDemo2 t=new ConcurrentHashMapDemo2();
		
		t.start();
		
		Thread.sleep(1000);
		
	
		
		Set s=chm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			
			Integer in=(Integer)itr.next();
			System.out.println(in+" "+chm.get(in));
		    Thread.sleep(1000);
		}
		
		
		
	
//		Iterator<Map.Entry<Integer,String>> itr=chm.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			
//	     Thread.sleep(1000);
//			Map.Entry<Integer,String> itr1=itr.next();
//			
//	     System.out.println(itr1.getKey()+" "+itr1.getValue());
//			
//		}
	      System.out.println(chm);
		
	}
}
