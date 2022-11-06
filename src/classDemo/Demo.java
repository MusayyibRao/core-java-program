package classDemo;


 class Demo {
   
	
	public static void mmm() {
	  int a=20;
	   class  Demo2{
		
	   public void m1()
	   {
		   System.out.println("this is static class"+a);
	   }
		
	   
	}
	  System.out.println("this is outter class");
	  
	  Demo2 d=new Demo2();
	    d.m1();
	
	}
	 
public static void main(String args[])
{

	
	Demo.mmm(); 
	
}
	 
	 
	 
}
