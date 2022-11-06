package string;

/*
this is custom  immutable class
*/

public final class ImmuDemo {
  
	
	private final int id;
	
	private final String name;
	
	
	public ImmuDemo(int id,String name)
	{
		
		this.id=id;
		this.name=name;
		
	}
	
	
	public int getId()
	{
		
		return id; 
	}
	
	public String getName() {
		return name;
	}
	
/*
 we can not create setter method in custom immutable class 
 */


//	public void setId(int id) {
//		this.id=id;
//		
//	}
	
	
	
	public static void main(String args[])
	{
		
		ImmuDemo im=new ImmuDemo(20,"ABC");
		System.out.println(im.id+" "+im.name);		

	
	}
  
  
	
}
