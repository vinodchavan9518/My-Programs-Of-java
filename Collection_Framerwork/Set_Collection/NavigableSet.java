package Collection_Framerwork.Set_Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
//A NavigableSet is a SortedSet extended with navigation methods reporting closest matches for given search targets. Methods lower, floor, ceiling, and higher return the greatest element in this set strictly less than, less than or equal to, greater than or equal to, and strictly greater than the given element, respectively. A NavigableSet may be accessed and traversed in either ascending or descending order.
public class NavigableSet {
    public static void main(String[] args) {
        
       NavigableSet<Integer> ns = new TreeSet<>();  
       ns.add(1); 
       ns.add(2); 
       ns.add(3); 
       ns.add(4); 
       ns.add(5); 
       ns.add(6); 

 System.out.println("lower(3): " + ns.lower(3));//Just below than the specified 
 
     
      System.out.println("floor(3): " + ns.floor(3)); //Equal  less or null 
    
      System.out.println("higher(3): " + ns.higher(3));//Just greater than specified element or null 
  
      System.out.println("ceiling(3): " + ns.ceiling(3));//Equal or greater or null  
         
   

    }
    
}
