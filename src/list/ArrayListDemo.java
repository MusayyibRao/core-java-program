package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListDemo {
	
	
	public static void main(String args[])
	{
		
		ArrayList<Integer> al=new ArrayList<>();

/* 
  arraylist follows the insertion order
 */

		al.add(30);
		al.add(20);
		al.add(10);
		al.add(50);
		
/*
  in arraylist we can store the duplicate elements		
 */
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(50);
/*
   in arraylist we can store n number of null value		
 */
//		al.add(null);
//		al.add(null);
		
System.out.println(al);


/*
 * we can get the elements by using iterator 
 */

System.out.println("---------------------------------------------------");
  
Iterator<Integer> itr=al.iterator();

while(itr.hasNext())
{
	
System.out.println(itr.next());
}

System.out.println("--------------------------------------------------");

/*
 * we can get the elements by using listIterator
 */


ListIterator<Integer> litr=al.listIterator();

while(litr.hasNext())
{
	
System.out.println(litr.next());

}



System.out.println("---------------------------------------------------");
System.out.println("using foreach() method");
System.out.println("----------------------------------------------------");

 al.forEach((e)->{
	System.out.println(e);
});
 
 
 System.out.println("---------------------------------------------------");
 System.out.println("using stream() method");
 System.out.println("----------------------------------------------------");
 
List<Integer>list=al.stream().filter((e)->e.equals(10)).collect(Collectors.toList());
 
 System.out.println(list);
	}

}



