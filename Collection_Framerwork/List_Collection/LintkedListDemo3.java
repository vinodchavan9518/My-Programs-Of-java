package Collection_Framerwork.List_Collection;

import java.util.LinkedList;
import java.util.ListIterator;
//find LinkedList collection with user defined class object
public class LintkedListDemo3 {
    public static void main(String[] args) {
	
		LinkedList<String>city=new LinkedList();
		
		city.add("Kolkata");
		city.add("Jalna");
		city.add("Puna");
		city.add("Mumbai");
		
		IO.println(city);
		
		ListIterator<String>it=city.listIterator();
		while(it.hasNext())
		{
			String cityName=it.next();
			if(cityName.equals("Kotkata"))
			{
				it.remove();
			}
			else if(cityName.equals("Puna"))
			{
				it.add("Ner");
			}
			else if(cityName.equals("pune"))
			{
				it.add("Hyderbad");
			}
		}

		city.forEach(System.out::println);
	}

}

    

