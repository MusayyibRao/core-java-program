package polymorphism;


class A
{
     	
 static  void m1()
	{
		
		System.out.println("This is a class A method");	
	}
	
}



class B extends A
{
	
public  static void m1()
{   // super.m1();
  
System.out.println("This is a class B method");

}


public void m2()
{
System.out.println("This is m2 method");	

}


}

public class OverrideDemo {

	
	public static void main(String args[])
	{
		
		A a= new B();
		//a.m1(a);
		//a.m1();
		A.m1();
		
		

		
//		B b=new B();
//		  b.m1(new B());
//		
//		//a=b;
//		
//		//b.m1(a);
//	// b.m1(new A());
//		
//		b.m2(new A());

	}
	
}
		



