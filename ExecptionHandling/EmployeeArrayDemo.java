package ExecptionHandling;

public class EmployeeArrayDemo {
    
	public static void main(String[] args) 
	{
		
		int size=Integer.parseInt(IO.readln("Enter  number of employee:  "));
		Object  []arr=new Object[size]; 
       
		
		for( int i=0;i<size;i++)
		{
			IO.println("Enter details for Employee:"+(i+1));
			int id =Integer.parseInt(IO.readln("Enter ID:"));
			String name=IO.readln("Enter Name");
		   double salary=Double.parseDouble(IO.readln(" Enter Salary:"));
			
			arr[i]=new Employee(id, name, salary);
			
		}
		for(Object o:arr)
		{
			IO.print(o);
		}
		
		
		
		
		
	}

}


class Employee
{
	int id;
	String name;
	double salary;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}

