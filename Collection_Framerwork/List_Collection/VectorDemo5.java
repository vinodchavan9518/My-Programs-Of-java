package Collection_Framerwork.List_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo5 {
    public static void main(String[] args) 
	{
		Vector<String>listOfCity=new Vector<>();
		listOfCity.add("surat");
		listOfCity.add("pune");
		listOfCity.add("Ahmadabad");
		listOfCity.add("jalna");
		listOfCity.add("delhi");
		
		Collections.sort(listOfCity);
		listOfCity.forEach(System.out::println);

		
		IO.print("  ");
		
		Vector<Integer>listOfNumber=new Vector<>();
		listOfNumber.add(500);
		listOfNumber.add(400);
		listOfNumber.add(600);
		listOfNumber.add(100);
		listOfNumber.add(800);
		listOfNumber.add(300);
		listOfNumber.add(200);
		listOfNumber.add(700);
		
		IO.println("Original Date");
		IO.println(listOfNumber);
		
		IO.println(" Ascending Order");
		Collections.sort(listOfNumber);
		
		IO.println(" Descending order");
		
		Collections.sort(listOfNumber,((i1,i2)->Integer.compare(i2,i1)));
		
		IO.println(listOfNumber);
		
		Vector<String>listOfFruits=new Vector<>();
		listOfFruits.add("Orange");
		listOfFruits.add("Manger");
		listOfFruits.add("apple");
		listOfFruits.add("Manger");
		
		Object[] fruit =listOfFruits.toArray();
		IO.println(Arrays.toString(fruit));
				
		
	}

}

    

