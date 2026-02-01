package Map_Collections.TreeMap;

import java.util.TreeMap;


record Product(int id, String name) {
    
    
}
public class TreeComparable {
    public static void main(String[] args) {
        
        TreeMap<Product, String> map = new TreeMap<>((p1,p2)->p1.id().compareTo(p2,id()));
         map.put(new Product(222,"Mobile"),"Hydera");
		map.put(new Product(111,"laptop"),"chennai");
		map.put(new Product(333,"camera"),"pun");
		IO.println("TreeMap entries are:");
		map.forEach((k,v)->IO.print(k+":"+v));
		
	}
	

}
    
    
