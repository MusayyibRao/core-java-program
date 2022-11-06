package inheritance;

public class Demo2 {

	
	public static void m1()
	{
		
		System.out.println("this is m1 method in class Demo2");
	}
   

	
}

class B extends Demo2
{
	
public static void m1() {
	
	System.out.println("this is m1 method in class B");
}


public static void m2() {
	System.out.println("This is m2 in class B");
}


public  void m3()
{
	  
	  System.out.println("this is m3 method in class C");
	 
}




}


class C extends B
{
	
	public static void m2()
	{
		
		System.out.println("This is m2 method in class C");
	}

 


}




