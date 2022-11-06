package array;

public class ArrayDemo1 {

/*
  print duplicate elements in 2 array. 
*/
	
	public static void main(String args[])
	{
		
	
		int arr[]= {3,4,7,9,31};
		int arr1[]= {4,5,7,7,9,9,55};
		 
		
	for(int i=0;i<arr.length;i++)
	{
		
		for(int j=0;j<arr1.length;j++)
		{
			
			if(arr[i]==arr1[j])
			{
				
				System.out.print(arr[i]+" ");
				break;
			}
			
			else {
				
				continue;	
			}
		}
	}
	
	
		
 }
	
}
