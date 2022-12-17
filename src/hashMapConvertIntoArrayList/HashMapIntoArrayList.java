package hashMapConvertIntoArrayList;
import java.util.*;

public class HashMapIntoArrayList
{

public static void main(String args[])
{

HashMap<String,Integer> map=new HashMap<>();

map.put("abc",123);
map.put("bcd",234);
map.put("cde",345);
map.put("efg",567);


Set<String> set=map.keySet();


ArrayList<String> list=new ArrayList<>(set);
 

Collection<Integer> value=map.values();

ArrayList<Integer> list1=new ArrayList<>(value);



System.out.println("key of the map"+list);
System.out.println("value of the map"+list1);
}

}

