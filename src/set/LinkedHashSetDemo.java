package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String args[])
	{
		
	LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
	
	lhs.add(40);
	lhs.add(50);
	lhs.add(20);
	lhs.add(10);
	lhs.add(30);
	
/*
 * null are allow only one in LinkedHashSet	
 */
	
	
	lhs.add(null);
	lhs.add(null);
	
	System.out.println(lhs);
	
System.out.println("---------------------------------------------------------");	
	/*/
	 * duplicate are not allow in LinkedHashSet
	 */
	
lhs.add(40);
lhs.add(50);
lhs.add(20);
lhs.add(10);
lhs.add(30);

System.out.println(lhs);

System.out.println("--------------------------------------------------------");



	
	}
	
}
