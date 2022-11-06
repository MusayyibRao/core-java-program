package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class LinkedListDemo {

	
	public static void main(String args[])
	{
		
		
	LinkedList<Integer> ll=new LinkedList<>();	
		
	  ll.add(30);
	  ll.add(40);
	  ll.add(60);
	  ll.add(80);
	  ll.add(10);
	  
	  System.out.println(ll);
	  
	
System.out.println("-----------------------------------------------------");	  
	  
/*
 
we can add duplicate elements easily
 */
	  
	  ll.add(30);
	  ll.add(40);
	  ll.add(60);
	  ll.add(80);
	  ll.add(10);
	
	  
	  
	  
	 
/*
 in LinkedList  we add null value easily  
 */
	  
//	  
//	  ll.add(null);
//	  ll.add(null);
	  
	  
 System.out.println(ll); 
 
 
 
 System.out.println("-----------------------------------------------------");
 /*
 in LinkedList  we can insert and delete in the middle  
 */
 
 System.out.println("in LinkedList  we can insert and delete in the middle  ");

 System.out.println("-----------------------------------------------------");
 ll.add(3, 200);
 ll.add(5, 300);
 ll.remove(1);
 ll.removeLast();
 
 System.out.println(ll);
 
 System.out.println(ll.getLast());
 
 System.out.println(ll.getFirst());
 
 
 System.out.println("-----------------------------------------------------");
	  

/*
 * we can get the elemenst by using for each loop
 */


for(Integer in: ll)
{
System.out.println(in);	
}


System.out.println("-----------------------------------------------------");


/*
 * we can get the elements by using forEach() method
 */
	
	
ll.forEach((e)->{
	System.out.println(e);
});


System.out.println("-----------------------------------------------------");


/*
 * we can get the elements by using  iterator
 */

Iterator<Integer> itr=ll.iterator();

while(itr.hasNext())
{
	
System.out.println(itr.next());

}



System.out.println("-----------------------------------------------------");


/*
 * we can get the elements by using ListIterator
 */

ListIterator<Integer> lItr=ll.listIterator();


while(lItr.hasNext())
	
{
	
System.out.println(lItr.next());

}



System.out.println("-----------------------------------------------------");


/*
 * we can get the elements by using stream() method
 */


List<Integer> list=ll.stream().filter(e->e.equals(40)).collect(Collectors.toList());

List<Integer> list1=ll.stream().filter(e->e>40).collect(Collectors.toList());

List<Integer> list2=ll.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
System.out.println(list);
System.out.println(list1);
System.out.println(list2);

	}
	
}
