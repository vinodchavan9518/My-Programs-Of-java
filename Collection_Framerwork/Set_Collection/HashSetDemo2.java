package Collection_Framerwork.Set_Collection;

import java.util.Arrays;
import java.util.HashSet;
//demonstrate the add() method of hashset which returns boolean value
public class HashSetDemo2 {
    public static void main(String[] args) {
        
       	Boolean values[]=new Boolean[6];
		
    HashSet<Object> hs=new HashSet<>();
    values[0]=hs.add(12);
    values[1]=hs.add(12);
    values[2]=hs.add("Java");
    values[3]=hs.add(new String("Java"));
    values[4]=hs.add(new StringBuffer("Nit"));
    values[5]=hs.add(new StringBuffer("Nit"));
    
    IO.print(Arrays.toString(values));
    IO.println("Hashset Element:");
    hs.forEach(System.out::println);
    


    }


    
}
