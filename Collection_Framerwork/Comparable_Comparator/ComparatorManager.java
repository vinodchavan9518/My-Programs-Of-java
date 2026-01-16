package Collection_Framerwork.Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;
//find the custom sorting based on id and name
record Manger(Integer id,String name)
{

}
public class ComparatorManager {
    public static void main(String[] args) {
		
	Manger manager[]=new Manger[3];
	manager[0]=new Manger(222,"vinod");
	manager[0]=new Manger(223,"scott");
	manager[0]=new Manger(777,"vinod");
	
		//Anonymous inner class
	   Comparator<Manger>cmpId=new Comparator<Manger>()
			   {

				@Override
				public int compare(Manger m1, Manger m2) {
					
					return Integer.compare(m1.id(), m2.id());
				}
		   
			   };
			   
			   Arrays.sort(manager,cmpId);
			   IO.print("Sorting manger date based on Id");
			   
			   for(Manger mangers:manager)
			   {
				   IO.print(mangers);
			   }
			   //by using lambda
			   Comparator<Manger>cmpName=(m1,m2)->m1.name().compareTo(m2.name());
		         Arrays.sort(manager,cmpName);
		         IO.print(" sorting the manger date based on the name:");
		         
		         for(Manger mangers:manager)
		         {
		        	 IO.print(mangers);
		         }

	}

}

    

