package singleton;

public class SingletonDemo {
	
/*
 * create static object	
 */
	
private static SingletonDemo sn=null;


/*
 * create private constructor
 */

private SingletonDemo() {
	
	
}



/*
 * create static getter method
 */
	
public static SingletonDemo getInstance()
{
	
if(sn==null)
{
	
sn=new SingletonDemo();

}
	
return sn;
}


public static void main(String args[])
{

	SingletonDemo sn1=new SingletonDemo(); //after trying to create another object but every time only one object will created 
	
	
  
System.out.println(sn.getInstance()); //same object create
System.out.println(sn1.getInstance());  // same object create
 
}

}
