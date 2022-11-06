package string;

public class String1 {

public static void main(String args[])
{
	
String str=new String("ABC");  

String str1="ABC";

String str3="ABC";

String str2=new String("ABC");

/*
 * == equals operator meant for address or object comparison    
 */

System.out.println(str==str3);  //false





/*
 *  equals() method meant for content comparison
 */

System.out.println(str.equals(str1));      //true 
//
//
//System.out.println(str==str1);   //  false
//
//
//System.out.println(str1==str2);  // false
//
//
//System.out.println(str==str2);   // false
//
//
 
System.out.println(str1==str3);  //true


//System.out.println(str1.equals(str3)); //true




System.out.println(str+" "+str1);  //ABC  ABC

System.out.println(str1.equals(str3)); //true






}	
	
}
