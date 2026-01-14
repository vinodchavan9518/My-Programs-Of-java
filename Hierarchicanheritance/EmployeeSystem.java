package Hierarchicanheritance;

import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter permanent employee Id");
		int EmployeeId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter permanent employee Name :");
		String employeeName=sc.nextLine();
		System.out.println("Enter permanent employee Salary :");
		double employeeSalary=Double.parseDouble(sc.nextLine());
		
		PermanentEmployee p1 = new PermanentEmployee(EmployeeId, employeeName, employeeSalary);
		System.out.println(p1);
		p1.netSalary();
		
		
		System.out.println("Enter permanent employee per Id");
		int EmployeeIdper=Integer.parseInt(sc.nextLine());
		System.out.println("Enter permanent employee per Name :");
		String employeeNameper=sc.nextLine();
		System.out.println("Enter permanent employee per Salary :");
		double employeeSalaryper=Double.parseDouble(sc.nextLine());
		System.out.println("Enter contractDuration:");
		int con = Integer.parseInt(sc.nextLine());
		
		ContractEmployee co=new ContractEmployee(EmployeeIdper, employeeNameper, employeeSalaryper, con);
		System.out.println(co);
		
		
		
		
	   

	}

}

class Employee {
	 protected int employeeId;
	protected String employeeName;
	protected double emloyeeSalary;
	
	
	public Employee(int employeeId, String employeeName, double emloyeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emloyeeSalary = emloyeeSalary;
	}

	
	

}

 class  PermanentEmployee extends Employee {
	 
	 protected double providentFund;

	public PermanentEmployee(int employeeId, String employeeName, double emloyeeSalary) 

	{
		
		super(employeeId,employeeName,emloyeeSalary);
		providentFund=emloyeeSalary*12/100;

	}
	

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emloyeeSalary="
				+ emloyeeSalary + ", providentFund=" + providentFund + "]";
	}



	public void netSalary()
	{
		double netSalary=providentFund+emloyeeSalary;
		System.out.println("NetSalary is:"+netSalary);
	}
	
	
	
}

 class  ContractEmployee extends Employee {
          protected int contractDuration;
          
          
          
      public ContractEmployee(int employeeId, String employeeName, double emloyeeSalary,int contractDuration) {
		super(employeeId, employeeName, emloyeeSalary);
		
		this.contractDuration=contractDuration;

		
		
	}



	  @Override
	  public String toString() {
		return "ContractEmployee [contractDuration=" + contractDuration + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", emloyeeSalary=" + emloyeeSalary + "]";
	  }
      
	

}