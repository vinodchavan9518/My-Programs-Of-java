package Collection_Framerwork.Set_Collection;
import java.util.HashSet;
//demonstrate the hashset which stores double values
public class HashSetDemo5 {
    public static void main(String[] args) {
        
        HashSet<Double> hs=new HashSet<>();
        hs.add(12.5);
        hs.add(10.5);
        hs.add(15.5);
        hs.add(20.5);
        hs.add(25.5);
        
        IO.println("HashSet Elements:");
        hs.forEach(value->IO.println(value));
    }
    
}
