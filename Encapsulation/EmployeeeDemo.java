package Encapsulation;
import java.util.Scanner;
//find employee designation based on salary
  public class EmployeeeDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number : ");
        int no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name   : ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary : ");
        double sal = sc.nextDouble();

        Employeee e = new Employeee(no, name, sal);

        System.out.println("\nEmployee Details :");
        System.out.println(e);

        System.out.print("\nEnter Increment Amount : ");
        double inc = sc.nextDouble();

        double newSal = e.getEmployeeSalary() + inc;
        e.setEmployeeSalary(newSal);

        System.out.println("\nUpdated Employee Details :");
        System.out.println(e);

        System.out.println("\n" + e.getEmployeeName() + " is a " + e.getEmployeeDesignation(newSal));

        sc.close();

	}
}
class Employeee {
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	public Employeee(int employeeNumber, String employeeName, double employeeSalary) {
		
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	

	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	
	public String getEmployeeName() {
		return employeeName;
	}

	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDesignation(double updatedSalary) {
        if (updatedSalary == 120000) {
            return "Employee is a HR Manager.";
        } else if (updatedSalary == 90000) {
            return "Employee is a Developer.";
        } else if (updatedSalary == 60000) {
            return "Employee is a Designer.";
        } else {
            return "Employee is a Tester.";
        }
	

	}
	public String toString() {
        return "Employee Number : " + employeeNumber + "\n" +
               "Employee Name   : " + employeeName + "\n" +
               "Employee Salary : " + employeeSalary;
    }
}

	
class EmployeeDemo {
   private String name;
   private double salary;

   public EmployeeDemo(String var1, double var2) {
      this.name = var1;
      this.salary = var2;
   }

   public String toString() {
      return "Employee [name=" + this.name + ", salary=" + this.salary + "]";
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public double getSalary() {
      return this.salary;
   }

   public void setSalary(double var1) {
      if (var1 < this.salary) {
         System.out.println("Invalid Data");
         System.exit(0);
      }

      this.salary = var1;
   }
}


	
	





