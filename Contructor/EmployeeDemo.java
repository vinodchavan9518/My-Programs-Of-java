package Contructor;

import java.util.Scanner;

public class EmployeeDemo 
{



	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("firstName:");
		String firstName=sc.nextLine();
		
		System.out.println("lastName:");
		String lastName=sc.nextLine();
		
		System.out.println("employeeId:");
		int employeeId=Integer.parseInt(sc.nextLine());
		
		System.out.println("salary:");
		double salary=Double.parseDouble(sc.nextLine());
		
		System.out.println("NoOfProject:");
		int noofProject=Integer.parseInt(sc.nextLine());
		
		ConstrouctorEmployee  e=new ConstrouctorEmployee(firstName, lastName, employeeId, salary, noofProject);
		System.out.println(e);
		e.calculateSalary();
		sc.close();
		
		
		
				
			
				
	}

	
	}





    class ConstrouctorEmployee {
	
	
	private  String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int NoOfProject;
	
	
	
	
	
	public ConstrouctorEmployee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		
		if(noOfProject<0) {
			System.out.println("NO of project cannot be Negative:");
			System.exit(0);
			
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		NoOfProject = noOfProject;
	}

     public String toString() {
		return "EmployeeConst [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}
	
	
	public void  calculateSalary() {
		int project=this.NoOfProject;
		System.out.println("this.salary");
		
		if(project>5 && project<10) 
			this.salary=5000;
			
		else if(project>10 && project<20)
			this.salary=10000;
		
		else if(project>20 )
			this.salary=15000;
			
			}
		
	}




    