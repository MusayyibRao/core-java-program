package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetDemo {

	public static void main(String args[])
	{
		
	HashSet<Integer> hs=new HashSet<>();	
	
	
	hs.add(20);
	hs.add(10);
	hs.add(40);
	hs.add(50);
	hs.add(30);
	

	System.out.println(hs);

	/*
	 * in hashSet the elements is not store in insertion order   
	 */
	System.out.println("-----------------------------------------------");
	hs.add(90);
	hs.add(80);
	hs.add(79);
	
	System.out.println(hs);
		
	
System.out.println("-----------------------------------------------");

/*
 * in hashSet we can not store duplicate elements
 */

hs.add(90);
hs.add(80);
hs.add(79);

System.out.println(hs);

System.out.println("-----------------------------------------------");

/*
 * in hashset we can  store only one null value
 */

//hs.add(null);
//hs.add(null);
//hs.add(null);


System.out.println(hs);
System.out.println("-----------------------------------------------");

/*
 * we can get the object by using for each loop
 */


for(Integer in:hs)
{
	
System.out.println(in);
}


System.out.println("-----------------------------------------------");

/*
 * we can get the object by using forEch method
 */


hs.forEach(e->{
	System.out.println(e);
});


System.out.println("-----------------------------------------------");

/*
 * we can't get the object by using  while loop
 */	


//System.out.println("-----------------------------------------------");

/*
 * we can get the object by using  iterator
 */	

Iterator<Integer> itr=hs.iterator();

while(itr.hasNext())
{
	
System.out.println(itr.next());

}

System.out.println("-----------------------------------------------");
/*
 * we can filter elements by using filter elements
 */
	
List<Integer>ll= hs.stream().filter(e->e.equals(20)).collect(Collectors.toList());

System.out.println(ll);


System.out.println("-----------------------------------------------");

/*
 *  we can sort elements by using sorted method 	
 */
	
List<Integer> ll1=hs.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());

System.out.println(ll1);

System.out.println("-----------------------------------------------");


	}	
}
