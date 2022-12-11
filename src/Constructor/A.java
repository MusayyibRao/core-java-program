package constructor;

public class A {

	private static int a;
	
	A(int a)
	{
		
		System.out.println(a);
		
	}
	
	public static void main(String args[])
	{
		
		A a=new A(20);
	}
	
}
