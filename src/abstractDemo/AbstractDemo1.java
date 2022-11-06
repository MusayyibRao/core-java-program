package abstractDemo;

public abstract class AbstractDemo1 {
	
	
	
	abstract void m1();
	abstract void m3();
	abstract void m4();
	
/*
 *  static method we can call directly without creating a object,
 *  only as a class name. 
 */
	
	public static void m2() {
		
		System.out.println("static method in abstract class");
		
	}
	

}

abstract class A extends AbstractDemo1
{

	/*
	 * if we want to override only one method of the the interface in a class, then required class abstract declared.  
	 */
	

	@Override
	void m1() {
		// TODO Auto-generated method stub
       System.out.println("this is override method in class a");  		
	}



}

class Main extends A{
	
	
	
	
	@Override
	void m3() {
		// TODO Auto-generated method stub
	  System.out.println("this is main method 1");	
	}

	@Override
	void m4() {
		// TODO Auto-generated method stub
		System.out.println("this is main method 2");
	}


	
	public static void main(String args[])
	{
		
		
		Main a=new Main();
		  a.m1();
		  AbstractDemo1.m2();
		  a.m4();
		  a.m3();
	}


	
}