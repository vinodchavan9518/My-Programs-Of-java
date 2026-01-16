package Collection_Framerwork.Comparable_Comparator;

import java.util.Collections;
import java.util.Vector;
//find the natural order sorting based on name

record Customer(Integer id,String name)implements Comparable<Customer> 
{

	@Override
	public int compareTo(Customer c) {
		
		return this.name.compareTo(c.name);
	}
	
}


public class CustromerComparable {
   public static void main(String[] args) 
	{
		Vector<Customer>listOfCustomer=new Vector<>();
		listOfCustomer.add(new Customer(333,"sctton"));
		listOfCustomer.add(new Customer(222,"allen"));
		listOfCustomer.add(new Customer(999,"Zuber"));

		Collections.sort(listOfCustomer);
		
		for(Customer customer:listOfCustomer)
		{
			System.out.println(customer);
		}
		
		
	}

}
 
    

