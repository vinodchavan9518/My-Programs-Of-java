package Map_Collections.NavigableHashMap;

import java.util.NavigableMap;
import java.util.TreeMap;
//find various methods of NavigableMap
public class NavigableMapDemo {
    public static void main(String[] args) {
        
        NavigableMap<Integer,String> map=new TreeMap<>();
		map.put(1, "vinod");
		map.put(2, "vishal");
		map.put(3, "akash");
		map.put(3, "aiay");
		map.put(4, "shubham");
		map.put(5, "radha");
		map.put(6, "Gathere");
		map.put(7, "Pooja");
		
		
		IO.println("LowerKey(2):"+map.lowerKey(1));
		IO.println("LowerEntry(akash):"+map.lowerEntry(3));
		IO.println("HigherEntry(pooja):"+map.higherEntry(6));
		IO.println("HigherKey(akash):"+map.higherKey(4));
		IO.println("FloorEntry(5):"+map.floorEntry(2));
		IO.println("FloorKey(shubham):"+map.floorKey(5));
		IO.println("ceilingKey(radha):"+map.ceilingKey(3));
		IO.println("ceilingEntrey(pooja):"+map.ceilingEntry(1));
		
		
	}


}
