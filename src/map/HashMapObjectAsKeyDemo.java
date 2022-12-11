package map;

import java.util.*;

public class HashMapObjectAsKeyDemo
{

public static void main(String args[])
{

Employee emp1=new Employee(101,"musa");
Employee emp2=new Employee(101,"musa");
Employee emp3=new Employee(101,"musa");

HashMap<Employee,String> empMap=new HashMap<>();

empMap.put(emp1,"user1");
empMap.put(emp2,"user2");
empMap.put(emp3,"user3");


for(Map.Entry<Employee,String> mp : empMap.entrySet())
{

System.out.print(mp.getKey()+" "+mp.getValue());

}


}


}