package Collection_Framerwork.List_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String>s1=new ArrayList<>();
		 s1.add("Ravi");
		 s1.add("vinod ");
		 s1.add("Rahul");
		 
		 ArrayList<String>s2=new ArrayList<>();
		 s2.add("Pallavi ");
		 s2.add("Pooja");
		 s2.add("puja ");
		 
		 s2.addAll(s2);
		 IO.println("Size of all "+s2.size());
		 s1.forEach(str->IO.println(str.concat(str)));
		 IO.println("+++++++++++++++++++++++++++++/");
		 
		 ArrayList<String>s4=new ArrayList<>();
		 s4.add("Ajay");
		 s4.add("Akal");
		 s4.add("sham");
		
		 ArrayList<String>s5=new ArrayList<>();
		 s5.add("viod");
		 s5.add("vishal");
		 s5.add("vimbnm");
		 s5.retainAll(s5);
		 s5.forEach(x-> IO.println(x));
		 
		 List<Integer>listOfNumber=  List.of(1,2,3,5,6,7,8);
		 listOfNumber.add(4);
		 listOfNumber.set(0,20);
		 listOfNumber.remove(3);
		 listOfNumber.forEach(System.out::println);
		 IO.println(listOfNumber);
		 
		 
		 
		 
	 }

}


    
    

