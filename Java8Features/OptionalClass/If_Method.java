package Java8Features.OptionalClass;
import java.util.Optional;
// The Optional class in Java 8 is a container object which may or may not contain a non-null value. It provides a way to handle null values gracefully and avoid NullPointerExceptions. The Optional class has several methods that allow you to check if a value is present, retrieve the value, or provide a default value if the value is not present.



class Employee
{
	private Integer id;
	private String name;
	
	public Employee()
	{
		
	}
	
	public Employee(Integer id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	
	//write new Style of getter
	
	public Optional<Integer>getId()
	{
		return Optional.ofNullable(this.id);
		
	}
	
	public Optional<String>getName()
	{
		return Optional.ofNullable(name);
	}
}


public class If_Method {
	
	void main()
	{
		Employee e1=new Employee();
		Optional<Integer> id=e1.getId();
		IO.println(id.orElse(00));
		
		Optional<String> name=e1.getName();
		IO.println(name.orElse(null));
		IO.println("================================");
		
		Employee e2=new Employee(120,"vinod");
		Optional<Integer> eid=e2.getId();
		
		//(ifPresent) is values is present in give values otherwise does not give value 
		eid.ifPresent(IO::println);
		
		Optional<String> ename=e2.getName();
		ename.ifPresent(IO::println);
		

		
	}

}
