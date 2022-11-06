package list;

import java.util.Stack;

public class StackDemo {
	
	
public static void main(String args[])
{
	

	Stack<Integer> s=new Stack<>();
	
	
	s.add(30);
	s.add(30);
	s.add(30);
	s.add(30);
	s.push(30);
	s.remove(2);
	s.pop();
	
	System.out.println(s);

	
	System.out.println(s.peek());//we can looks to the object top of stack without removing from the stack 
} 

	

}
