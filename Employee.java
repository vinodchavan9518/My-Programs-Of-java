
import java.util.Scanner;

class employeeDemo
{
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	
	public employeeDemo(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public void setEmployeeNumber(int no)
	{
		this.employeeNumber=no;
	}
	public void setEmployeeName(String name)
	{
		this.employeeName=name;
		
	}
	public void setEmployeeSalary(double salary)
	{
		this.employeeSalary=salary;
	}

	public String  getEmployeeDesignation(double salary)
	{
		if(salary>120000)
			return "Employee is a HR Manger";
		else if(salary>90000)
			return "Employee is a Devaloper";
		else if(salary>60000)
		return "Employee is a Designer";
		else return "None";
			
			
		}
		
	
	
	
	
	public String toString() {
		return "employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
}




public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employeeDemo e=new employeeDemo.(12,"vinod",20000);
		System.out.println("Enter aEmployeeNumber:");
		int number =Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Enter a EmployeeName");
		String name=sc.nextLine();
		
		System.out.println("Enter a EmployeeSlary");
		double salary=Double.parseDouble(sc.nextLine());
		
		e.getEmployeeDesignation(30000);
	    e.toString();
		
		

	}

}


