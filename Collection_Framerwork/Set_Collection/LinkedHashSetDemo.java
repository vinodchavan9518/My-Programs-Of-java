package Collection_Framerwork.Set_Collection;

import java.util.LinkedHashSet;
//find the insertion order using linkedHashSet
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        LinkedHashSet<String >ihs=new LinkedHashSet<>();
		
		ihs.add("Vinod");
		ihs.add("Vijay");
		ihs.add("Ravi");
		ihs.add("Vishal");
		ihs.add("Ajay");
		ihs.add("Pawan");
		ihs.add("Shiva");
		ihs.add(null);
		ihs.add("Ganesh");
		IO.println(ihs);
		
		IO.println("+++++++++++++++");
		
		ihs.forEach(str->IO.println(str));

    }
}


    
    

