package Collection_Framerwork.Set_Collection;
import java.util.Iterator;
import java.util.TreeSet;
// A Java program to demonstrate the use of TreeSet class and its methods
public class TreeSetAscendingOrder {
    public static void main(String[] args) {
        
		TreeSet<String>t2=new TreeSet<>();
		t2.add("Manago");
		t2.add("Grape");
		t2.add("Apple");
		t2.add("Orangle");
		
		IO.print("In asceending order");
		IO.println(t2);
		
		
		IO.println("IN Descender Order:");
		Iterator<String> decInterator=t2.descendingIterator();
		while(decInterator.hasNext())
		{
			IO.println(decInterator.next());
		}
	}

    }
    

