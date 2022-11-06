package Constructor;


/*
 * constructor chaining
 */

public class B {
	
	
	
	
	B()
	{
		
		System.out.println("this is default constructor");
		
		
	}
	
	B(int a)
	{
		
		this();
		System.out.println("this is parameter constructor "+a);
		       
	}
	
	
	B(int a,String name){
		
		  this(a);
		System.out.println("this is parameter construcor"+a+" "+name);
		
		
	}
	
	public static void main(String args[])
	{
	
		B b=new B(30,"Abc");
		
	}
	
}
