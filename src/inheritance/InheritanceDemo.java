package inheritance;

public class InheritanceDemo {

	
public static  void m1()
{
	
System.out.println("This is inheritance method.......1");
	
}

public void m2() {
	
	System.out.println("this is inheritance method 2");
}
	
}



class A extends InheritanceDemo
{
	


	public static  void m1()
	{
					System.out.println("this override method...... 1");
			
		
		
	}
	public void m2() {
		
		System.out.println("this is override method......... 2");
	}


	
	public static void main(String args[])
	{
		
		System.out.println("-------------------------------------------------------------");
		
		InheritanceDemo i=new InheritanceDemo();
		
		A a=new A();
		a.m1();
		a.m2();
		System.out.println("-------------------------------------------------------------");
		i.m1();
		i.m2();
		
	}
}
