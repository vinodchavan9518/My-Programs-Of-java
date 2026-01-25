package Map_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
//find student record using HashMap

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Vinod");
		map.put(2, "Vishal");
		map.put(3, "Vikas");
		map.put(4, "Vivek");
		
		IO.println("HashMap entries are:");
		IO.println(map);
		
		IO.println("By using forEach Method:");
		map.forEach((key,value)->IO.println("Key is:"+key+"Value is:"+value));
		
		String icream =map.get(4);
		IO.println(icream);
		
		icream=map.getOrDefault(1, "This is not exting");
		IO.println(icream);
		
		boolean hasKey=map.containsKey(3);
		IO.println("HashMap contains key 3:"+hasKey);
		
		Boolean hasValue=map.containsKey("Vinod");
		IO.println("HashMap contains value Vinod:"+hasValue);
		
		map.remove(3);
		IO.print("After removing key 3 map is:"+map);
		
		IO.println("Iterating through itertor:");
		Iterator<Entry<Integer,String>> itr =map.entrySet().iterator();
		itr.forEachRemaining(System.out::println);
		
		IO.println("Iterating througth iteraor:");
		for(HashMap.Entry<Integer, String>entry:map.entrySet())
		{
			IO.print("Key is :"+entry.getKey()+"value is:"+entry.getValue());
		}
		
		int size =map.size();
		IO.println("szie of HashMap:"+size);
		
		map.clear();
		IO.print("HasnmMap afte cleaning :"+map);
		IO.println("Is map emty :"+map.isEmpty());
		
		
	}


    
}
