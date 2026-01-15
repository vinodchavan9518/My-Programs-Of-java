package Collection_Framerwork.List_Collection;

import java.util.ArrayList;
import java.util.Collections;

//find ArrayList collection sorting using Comparable interface
record Custromer(Integer id,String name,Double sal)implements Comparable<Custromer>
{

 @Override
	public int compareTo(Custromer c1) {
		
		return this.name.compareTo(c1.name);
	}
}	
public class ArrayListDemo3 {
    public static void main(String[] args) {
		
		ArrayList<Custromer>listOfCustromer=new ArrayList<>();
       listOfCustromer.add(new Custromer(111, "Scott", 2000d));
       listOfCustromer.add(new Custromer(211, "allen", 4000d));
       listOfCustromer.add(new Custromer(311, "smith", 3000d));
       listOfCustromer.add(new Custromer(411, "john", 9000d));
       	
		IO.print("Orignal Custromer Object");
		listOfCustromer.forEach(System.out::println);
		
		Collections.sort(listOfCustromer);
		IO.print("Sorting based on the name:");
		listOfCustromer.forEach(System.out::println);
	}

}

