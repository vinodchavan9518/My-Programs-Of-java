package Java8Features.ConstructorRef;
import java.util.function.BiFunction;
//the constructor reference for the record class
record Employee(Integer id,String name)
{
	
}



public class Demo2 {
	void main()
	{
	BiFunction<Integer, String,Employee>fn1=Employee::new;
	Employee obj=fn1.apply(123, "James");
	IO.println(obj);
	
	
	}

}
