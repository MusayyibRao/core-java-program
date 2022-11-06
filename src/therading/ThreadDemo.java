package therading;

public class ThreadDemo extends Thread{

	//static Thread t;
	
public void start() {
	    	  
	//super.start();	
		for(int i=0;i<10;i++)
		{
			//Thread.yield();
				
			System.out.println("this is a start thread");
		}
		
	}
	
	
	
//	public void run()
//	{
//		 
//		for(int i=0;i<10;i++)
//		{
//			
//			System.out.println("this is run thread");
			
//		try {	
//			
//			t.join();
//		    Thread.sleep(1000);
//		System.out.println("this is run thread");
//		}
//		catch(Exception e) {}
//	}
//	}
	
	
	
	
	
	
}



class Main
{
	

public static void main(String args[]) throws InterruptedException
{
	
//ThreadDemo.t=Thread.currentThread();
	//Thread.currentThread().setPriority(10);
ThreadDemo d=new ThreadDemo();
   d.start();
      //d.join();
    d.setPriority(0);
   for(int i=0;i<10;i++)
   {
	  // d.sleep(2000);
	   //d.yield();    
   System.out.println("Mian thread");
}
}

}
