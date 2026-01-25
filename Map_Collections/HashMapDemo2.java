package Map_Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> newmap1=new HashMap<>();//3
		HashMap<Integer, String> newmap2=new HashMap<>();//1
		
		newmap1.put(1,"ocpjp");
		newmap1.put(2,"is");
		newmap1.put(1,"best");
		
		IO.println("Values in newmap1:"+newmap1);
		
		newmap2.put(4, "Exam");
		IO.println(" values in newmap2:"+newmap2);
		
		IO.println("All the key are:");
		Set<Integer>KeySet=newmap1.keySet();
		IO.println(KeySet);
		
		IO.println("All the values are:");
		Collection<String>values=newmap1.values();
		IO.print(values);
		
		//Loose coupling
		HashMap<String,String> map1=new HashMap<>();
		map1.put("raj@gmail.com", "raj487");
		map1.put("ravi@gmail.com", "raj437");
		map1.put("scott@gmail.com", "raj497");
		
		IO.println("from Map 1:"+map1);
		
		HashMap<String, String> map2=new HashMap<>();
		IO.println("from map2:"+map2);
		
	}

}



    
    

