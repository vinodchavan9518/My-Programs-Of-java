package Map_Collections.LinkedHashMap;
import java.util.LinkedHashMap;
// Demonstration of LinkedHashMap with null key
public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
       LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(); 
         linkedHashMap.put(1, "Red");
            linkedHashMap.put(2, "Green");
            linkedHashMap.put(4, "Blue");
            linkedHashMap.put(3, "Yellow");
            linkedHashMap.put(null, "Pink");
            IO.println("LinkedHashMap entries are:");
            IO.println(linkedHashMap);
    }
    
}
