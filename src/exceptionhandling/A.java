package exceptionhandling;

public class A {

	
int a=10;

public static void m1()
{
	
try {
	
	int b=10/0;
	
	System.out.println(b);
}
catch(Exception e)
{   
	//System.exit(0);
	e.printStackTrace();
   // System.out.println(e);
}
System.out.println("---------------------------------------------------------");

try {
	
	String s=null;
	 s.length();
}

catch(Exception e)
{
   e.printStackTrace();	
}


System.out.println("---------------------------------------------------------");


try {
		
  String s[]=new String[10];	
  
     s[10]="rao";
     
}

catch(Exception e)
{
 e.printStackTrace();	
}


try {
	
String s=new String("abc");
 Object ob=(Object)s;
 
 Object o=new Object();
 String st=(String)o;
 
 System.out.print(ob);
	
}
catch(Exception e)
{
	e.printStackTrace();
	
}

}

public static void main(String args[])
{
	A.m1();

}

}



//class Rao
//{
//	
//}


//class Main
//{
//public static void main(String args[])
//{
//	
////A.m1();
//	
////Rao r=new Rao();	
//	
//}
//}


	
	