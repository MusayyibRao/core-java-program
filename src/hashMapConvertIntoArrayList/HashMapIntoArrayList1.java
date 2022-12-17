//package hashMapConvertIntoArrayList;
import java.util.*;

public class HashMapIntoArrayList1
{

public static void main(String args[])
{

HashMap<String,Integer> map=new HashMap<>();

map.put("abc",123);
map.put("bcd",234);
map.put("cde",345);
map.put("efg",567);


Set<Map.Entry<String,Integer>> set=map.entrySet();


ArrayList<Map.Entry<String,Integer>> list1=new ArrayList<>(set);

System.out.println("key & value of the map"+list1);
}

}

