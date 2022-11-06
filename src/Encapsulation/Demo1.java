package Encapsulation;

public class Demo1 {
	
	
	private int a;
	private int b;
	
	
	public  int getA()
	{
		
		return a;
	}
	
	public void  setA(int a)
	{
		this.a=a;
	}
	
	public  int getB()
	{
		return b;
		
	}
	
	public void setB(int b)
	{
		this.b=b;
		
	}
	
	
	
 public static void main(String args[])
 {
	 Demo1 d=new Demo1();
	 //Demo1.a=10;
	 //Demo1.b=30;
     d.a=30;
     d.b=40;
	 
	 System.out.println(d.getA());
	 System.out.println(d.getB());
 }

}
