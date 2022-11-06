package array;

import java.util.Scanner;

public class ArrayDemo {

public static void main(String args[])
{
	
Scanner sc=new Scanner(System.in);
	
int arr[]=new int[5];

System.out.println("please enter the number");

for(int i=0;i<arr.length;i++)
{
	
arr[i]=sc.nextInt();

}


for(int j=0;j<arr.length;j++)
{
	
System.out.print(arr[j]+" ");

}


	
	
}	

}
