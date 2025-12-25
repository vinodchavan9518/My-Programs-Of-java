package InterfaceAndAbstract.MethodOverridingAndOverding;

import java.util.Scanner;

class Employee

{
	protected String name;
	protected double salary;
	
	public Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	double calculate()
	{
		return salary;
	}
}
class FullTime extends Employee
{
	public FullTime(String name,double salary)
	{
		super(name,salary);
	}
	
	double calculate ()
	{
		return salary +5000;
	}
}
class PartTime extends Employee
{
	public PartTime(String name,double salary)
	{
		super(name,salary);
	}
	double calculate()
	{
		return (salary/30)*10;
	}
}


public class EmploySalary{

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name:");
	String name=sc.nextLine();
	
	System.out.println("1)FullTime:");
	System.out.println("2)PartTime:");
	System.out.println("Enter of choice:");
	int choice=Integer.parseInt(sc.nextLine());
	
	
	
	System.out.println("Enter Salary:");
	double salary =Double.parseDouble(sc.nextLine());

	Employee em= new FullTime("vinod",0);
	
	Employee em2=new PartTime(null, 0);
	System.out.println("FullTime Salary:"+em.calculate());
	System.out.println("PartTime Salary:"+em2.calculate());
	
	

	}

}
