package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {
	
	
	public static void main(String args[])
	{
		
	CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
	
	
/*	 
 in arrayList we are trying to add new elements after iterator
     then we will get ConcurrentModificationException
*/
	
	//	ArrayList<Integer> al=new ArrayList<>();
		
		al.add(40);
		al.add(10);
		al.add(20);
		
	/*
	 * in CopyOnWriteArrayList any number of null elements are allowed	
	 */
		
		al.add(null);
		al.add(null);
		
		/*
		 * in CopyOnWriteArrayList duplicate  elements are not allowed	
		 */
		
	
		al.add(40);
		
	Iterator<Integer>itr=al.iterator();
	 
	al.add(50);
	
	while(itr.hasNext())
	{
		
		Integer in=(Integer)itr.next();
	
		
	/*
	 * in iterator of CopyOnWritearrayList are not allow  remove operation if we are trying to 
	 * this operation then we will get UnsupportedException.
	 */
		
	/*	
		if(in%2==0)
		{
			
			itr.remove();
		}
		
     */
		
		
		System.out.println(in);
	}
		
	
		
		
		
	}

}
