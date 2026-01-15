package Encapsulation;

import java.util.Scanner;



public class EmployeeDemo1 {
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Employee name :");
		String name= sc.nextLine();
		
		System.out.println("Enter Employee Salary :");
		double salary = Double.parseDouble(sc.nextLine());
		
		Employee emp = new Employee(name, salary);
		System.out.println(emp);
		
		System.out.println("Enter Your Incrent amount : ");
		double increment = Double.parseDouble(sc.nextLine());
		
		emp.setSalary(emp.getSalary()+increment);
		System.out.println(emp);
		sc.close();
		
		
	}


    
}
class Employee {

	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		
		if(salary < this.salary)
		{
			System.out.println("Invalid Data");
			System.exit(0);
		}
		this.salary=salary;
	}
	
	}
	
	
