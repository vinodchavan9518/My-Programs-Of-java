package Collection_Framerwork.List_Collection;

import java.util.ArrayList;
//find ArrayList collection clone method and copy constructor
public class ArrayListDemo2 {
    public static void main(String[] args) {
		ArrayList<String>original=new ArrayList<>();
		
		original.add("VBN");
		original.add("bsc");
		original.add("bca");
		original.add("mca");
		original.add("b.tech");
		
		
		IO.println(" Copy the origin data using clone copy cnstuctor");

		
		
		 @SuppressWarnings("unchecked")
		 ArrayList<String >cloned=(ArrayList<String >)original.clone();
		 
		 IO.println(cloned);
		 
		 IO.println("By using Copy Constructor");
		 ArrayList<String>copCons=new ArrayList<>();
		 IO.print(copCons);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

}
