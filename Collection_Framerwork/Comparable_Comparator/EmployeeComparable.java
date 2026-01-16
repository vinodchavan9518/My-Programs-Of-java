package Collection_Framerwork.Comparable_Comparator;

import java.util.Arrays;
//find the natural order sorting based on name
record Employee(Integer id,String name) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e) {
		
		return this.name.compareTo(e.name);
	}
	
}

public class EmployeeComparable {
    public static void main(String[] args)
	{
		Employee[]empl=new Employee[4];
		empl[0]=new Employee(222,"Vinod");
		empl[1]=new Employee(111,"allen");
		empl[2]=new Employee(888,"sctton");
		empl[3]=new Employee(333,"joen");
		
		
		Arrays.sort(empl);
		
		for(Employee employee:empl)
		{
			System.out.println(employee);
		}
	}

}



