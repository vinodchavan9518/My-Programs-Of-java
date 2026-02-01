package Map_Collections.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// Demonstration of LinkedHashMap usage
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Cherry");
        linkedHashMap.put(4, "Date");
        linkedHashMap.put(5, "Elderberry");
        linkedHashMap.forEach((k,v)->IO.println("keyis:"+k+"values"+v));
    }
    
}
