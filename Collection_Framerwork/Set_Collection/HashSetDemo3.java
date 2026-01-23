package Collection_Framerwork.Set_Collection;

import java.util.HashSet;
import java.util.Set;
//demonstrate the hashset which allows only one null value
public class HashSetDemo3 {
    public static void main(String[] args) {
        
      Set<Integer> hs=new HashSet<>();
		hs.add(89);
		hs.add(87);
		hs.add(null);
		hs.add(null);
		hs.add(33);
		hs.add(45);
		hs.add(12);
		hs.add(35);
	
	hs.forEach(num->System.out.println(num));
		

	}
    
}
