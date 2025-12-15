package Hierarchicanheritance;


    import java.util.Scanner;

    class Employee1
   {
	protected int employeeid;
	protected String employeename;
	protected double employeesalary;
	
	
	public Employee1(int employeeid, String employeename, double employeesalary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}
	
    }
  class PermanentEmployee extends  Employee1
   {
   protected double providentfund;

   public PermanentEmployee(int employeeid, String employeename, double employeesalary, double providentfund) {
	super(employeeid, employeename, employeesalary);
	this.providentfund = providentfund*12/100;
  }
  public String toString() {
	return "PermanentEmployee [providentfund=" + providentfund + ", employeeid=" + employeeid + ", employeename="
			+ employeename + ", employeesalary=" + employeesalary + "]";
  }
  
  public void netsalary()
  {
	   double netsalary = employeesalary+providentfund;
	   System.out.println("net salary is "+netsalary);
  }
  
  }
  class ContractEmployee extends Employee1
  {
  protected int contractDuration;

  public ContractEmployee(int employeeid, String employeename, double employeesalary, int contractDuration) {
  super(employeeid, employeename, employeesalary);
  this.contractDuration = contractDuration;
  }

	@Override
  public String toString() {
  return "ContractEmployee [contractDuration=" + contractDuration + ", employeeid=" + employeeid
				+ ", employeename=" + employeename + ", employeesalary=" + employeesalary +  "]";
  }
	
  }
	
  public class EmployeeDemo {
  public static void main(String[] args) 
       {
		
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		System.out.println("Enter choice :: ");
    	int choice=Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Enter permanent employee Id :");
    	int employeeid=Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Enter permanent employee Name :");
    	String employeeanme=sc.nextLine();
    	
    	System.out.println("Enter permanent employee Salary :");
    	double employeesalary=Double.parseDouble(sc.nextLine());
    	
    	switch(choice)
    	{
    	case 1 : 
    		PermanentEmployee p1=new PermanentEmployee(employeeid, employeeanme, employeesalary, employeesalary);
    		System.out.println(p1);
    		p1.netsalary();
    		break;
    		
    	case 2 :
    		System.out.println("Enter contractDuration :");
    		int Duration= Integer.parseInt(sc.nextLine());
    		ContractEmployee c1= new ContractEmployee(employeeid, employeeanme, employeesalary, Duration);
    		System.out.println(c1);
    		
    		default :
    			System.out.println("Invalid choice");
    	
    	}
    	
    	}
    	       
    	
    }
}


