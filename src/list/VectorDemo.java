package list;

import java.util.Vector;

public class VectorDemo {

	
	public static void main(String args[])
	{
	
 Vector<Integer> v=new Vector<>();	
	
 
   
v.add(30);
v.add(20);
v.add(10);
v.add(50);
v.add(40);


System.out.println(v);

/*
 * in vector we can add duplicate elements 
 */
System.out.println("-----------------------------------------------"); 

v.add(20);
v.add(10);
v.add(50);

System.out.println(v);

 
System.out.println("--------------------------------------------------"); 

/*
 * in vector we can add null elements
 */
 

v.add(null);
v.add(null);

System.out.println(v);


System.out.println("-------------------------------------------------");



}
	
}
