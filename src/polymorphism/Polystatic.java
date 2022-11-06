package polymorphism;

public class Polystatic {

	  int a=20;
	   
	 
	public void m1(int x,int y)
	{
		System.out.println("this is static ploy...x="+x+" y="+y);
		
	}
	
	public void m1(int x)
	{
		
		System.out.println("value of x="+x);
	}
	
}	
	
class Main{	
	
public static void main(String args[])
{

	int a=90;	
	Polystatic p=new Polystatic(); 
	p.m1(30,40);
	p.m1(20);	
	
	System.out.println(p.a);
}

}

