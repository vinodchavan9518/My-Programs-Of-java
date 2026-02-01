package Map_Collections.TreeMap;

import java.util.TreeMap;
//find how TreeMap sorts the keys
public class TreeMapDemo {
    public static void main(String[] args) {
        
        	TreeMap<Object,String> t=new TreeMap<>();
		t.put(12, "VINod");
		t.put(3, "ajay");
		t.put(4, "Dinest");
		t.put(1, "Pavan");
		t.put(5, "scott");
		t.put(8, null);
		
		IO.print(t);
		
    }
    
}
