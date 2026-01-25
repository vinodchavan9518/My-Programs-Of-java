package Collection_Framerwork.Set_Collection;

import java.util.HashSet;
//demonstrate the hashset which stores string values and allows only one null value
public class HashSetDemo6 {
    public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Rav");
		hs.add("Vaij");
		hs.add(new String("Rav"));
		hs.add("Ajay");
		hs.add("Akash");
		hs.add("Seta");
		hs.add(null);
		hs.add(null);
		
		hs.forEach(str -> System.out.println(str));
			IO.println("Size of HashSet: "+hs.size());	
		
    }
    
}
