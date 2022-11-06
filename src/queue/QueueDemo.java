package queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	
	  public native void m1();
	
	
	public static void main(String args[])
	{
		
		Queue<Integer> q=new ArrayDeque<>();
		
		Queue<Integer> qq=new LinkedList<>();
		
		qq.add(20);
		qq.add(40);
		qq.add(50);
		qq.add(40);
		qq.add(50);
	    qq.remove();
	  System.out.println(qq);
		System.out.println("-------------------------------------------");
		
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
	
		
		System.out.println(q);
		System.out.println("------------------------------------------");
		
		q.remove();
		
		System.out.println(q);
		
		
	}

}
