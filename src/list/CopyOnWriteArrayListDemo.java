package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo extends Thread{

	
   static CopyOnWriteArrayList<Integer>al=new CopyOnWriteArrayList<>();	
   
  /*
   * in arrayList we are trying to modify Iterating list object then  we will get ConcurrentModificationException  
   */
   
  // static ArrayList<Integer>al=new ArrayList<>();  
	
   
     public void run() {
    	
    	 try {
    		 
    		 
    		 Thread.sleep(1000);
    	 }
    	 catch(Exception e)
    	 {
    		 
    	 }
    	 System.out.println("child thread");
    	 al.add(60);
    	 al.add(80);
    	 	 
     }
    
     
     
     public static void main(String args[])  throws InterruptedException
     {
    	 
    	al.add(30);
    	al.add(20);
    	al.add(50);
    	al.add(10);
    	
    	
    	CopyOnWriteArrayListDemo ct=new CopyOnWriteArrayListDemo();
    	
    	ct.start();
    	
        ct.sleep(1000);	
        Iterator<Integer> itr=al.iterator();
        
        while(itr.hasNext())
        {
        	
        	Integer in=(Integer)itr.next();
        	
        	System.out.println(in);
        	 Thread.sleep(1000);
        }
    	 
    	System.out.println(al);
    	 
     }
   
   
	
}
