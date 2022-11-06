package interface;

public interface Demo {
	
	
	 void m1();
	 
	 default void def() {
		 System.out.println("this is default...Demo");
	 }
	 

	public static void m2() {
		 
	 System.out.println("this is static method in interface...demo");
	
	 }
	 
	 default void mm()
	 {
		 System.out.println("this is default method.....");
	 }

		 
	 interface Demo1
	 {
		 
		 void m3();
		 public static void m4()
		 {
			 System.out.println("this is static method in interface......demo1");
		 }
		 
		 default void def() {
			 System.out.println("this is default...inner");
		 }
	 }

}



interface Demo2 
{
	
   void m5();

}


interface Demo3 extends Demo2,Demo
{
	
//default void def() {
//	System.out.println("this is default Demo3...");
//}

}



 class Main implements Demo3,Demo.Demo1
{

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("this is m5 method in class main");
	}

	@Override
	public void m1() {
		
		// TODO Auto-generated method stub
		System.out.println("this is m1 in class main");
	}
	
	
	

	public static void main(String args[])
	{
		
		Main m=new Main();
		
	    m.m1();
	    m.m5();
	   Demo.Demo1.m4();
	   
	   m.def();
	   Demo.m2();
	    m.mm();
	    
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
		System.out.println("this is inner interface method");
	}

	@Override
	public void def() {
		// TODO Auto-generated method stub
	    Demo3.super.def();
	    Demo.Demo1.super.def();
	}

	
	
}



