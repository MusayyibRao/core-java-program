package therading;

public class SynchroDemo {

	
	public synchronized void wish(String name)
	
	{
		
		for(int i=0;i<10;i++)
		{
			try {
			   Thread.sleep(1000);
			System.out.println("good morning");
			}
			catch(Exception e) {}
		 System.out.println(name);
		}
		
		
	}
}

class ThreadDemo1 extends Thread
{
	
SynchroDemo sd;

String name;

public ThreadDemo1(SynchroDemo sd ,String name) {
	// TODO Auto-generated constructor stub
   this.sd=sd;
   this.name=name;
}


public void run() {
	
    sd.wish(name);
	
//	for(int i=0;i<10;i++)
//	{
//		
//		
//	}
	
}

}


class Main1
{
	
public static void main(String args[])
{
	
SynchroDemo sd=new SynchroDemo();	
ThreadDemo1 t=new ThreadDemo1(sd, "abc");
ThreadDemo1 t1=new ThreadDemo1(sd, "def");

t.start();
t1.start();
 

}

}
