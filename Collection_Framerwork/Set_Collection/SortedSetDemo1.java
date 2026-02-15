package Collection_Framerwork.Set_Collection;
import java.util.SortedSet;
import java.util.TreeSet;
// A Java program to demonstrate the use of SortedSet interface and its methods
public class SortedSetDemo1 {
    
         public static void main(String[] args) {
            
            TreeSet<String> name =  new TreeSet<>();
            name.add("Ravi");
            name.add("Vijay");
            name.add("Ajay");
            name.add("Vievk");
            name.add("Vishal");

            SortedSet<String> sub=new TreeSet<>();
            sub=name.subSet("Ajay", "Vievk");
            System.out.println("Using subSet() "+sub);//[Ajay, Ravi, Vijay]
            System.out.println(sub.first());//
            System.out.println(sub.last());
            sub=name.headSet("Vievk");
             System.out.println("Using headSet()"+sub);
             sub=name.tailSet("Vievk");
                System.out.println("Using tailSet()"+sub);







         }
    




     }
        



    
    

