package Java8Features.ConstructorRef;
import java.util.function.BiFunction;
import java.util.function.Function;
//find the constructor refefind the method reference for the following codefind the method reference for the following code
record Customer(Integer id,String name)
{
	
}


public class Demo3 {
	void main()
	{
		Function<Integer, Customer[]>fn=Customer[]::new;
		
		int size=Integer.parseInt(IO.readln("Enter the size"));
		
		Customer[] customers=fn.apply(size);
		
		for(int i=0;i<size;i++)
		{
			int id =Integer.parseInt(IO.readln("Enter Customer id:"));
			String name=IO.readln("Enter Custromer Name:");
			customers[i]=new Customer(id, name);
			
		}
		IO.println("Printing the Customer Data:");
		
		
		for(Customer customer :customers)
		{
			IO.println(customer);
		}
		
		
		
	}

}
