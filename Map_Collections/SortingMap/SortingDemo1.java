package Map_Collections.SortingMap;

import java.util.SortedMap;
import java.util.TreeMap;
//find first,last,headmap,tailmap,submap
public class SortingDemo1 {
    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<>(); 
        map.put(5,"Five");     
        map.put(2,"Two");
        map.put(8,"Eight");
        map.put(1,"One");     
        map.put(4,"Four");
        
        System.out.println("First Key: "+map.firstKey());  //1 
        System.out.println("Last Key: "+map.lastKey());   //8
        System.out.println("headMap: "+map.headMap(4));  //1 2 
        System.out.println("tailMap: "+map.tailMap(4));  //4 5 8 
        System.out.println("subMap: "+map.subMap(2, 5)); //2 4





    }
    
}
