package Map_Collections.HashMap;

import java.util.HashMap;
//find more details about HashMap
public class HashMapDemo {
    void main()
	{
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
		
		icream=map.getOrDefault(2, "This is not exting");
		IO.println(icream);
		
		boolean hasKey=map.containsKey(3);
		IO.println("HashMap contains key 3:"+hasKey);
		
		Boolean hasValue1=map.containsKey("Vinod");
		IO.println("HashMap contains Key Vinod:"+hasValue1);
		
		
		Boolean hasValue=map.containsValue("Vinod");
		IO.println("HashMap contains value Vinod:"+hasValue);
		
		map.remove(3);
		IO.println("After removing key 3 map is:"+map);
		
		IO.println("Iterating through itertor:");
		Iterator<Entry<Integer,String>> itr =map.entrySet().iterator();
		itr.forEachRemaining(System.out::println);
		
		IO.println("Iterating througth iteraor:");
		for(HashMap.Entry<Integer, String>entry:map.entrySet())
		{
			IO.println("Key is : " +entry.getKey()+ " value is:"+entry.getValue());
		}
		
		int size =map.size();
		map.size();
		IO.println("szie of HashMap:"+size);
		
		
		map.clear();
		IO.print("HasnmMap afte cleaning :"+map);
		IO.println("Is map emty :"+map.isEmpty()); 
		
		
	}

}

    

