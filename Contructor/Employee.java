package Contructor;

public class Employee {
    

	
	private int employeeid;
	private String employeename;
	
	public Employee(int employeeid,String employeename)
	{
		this.employeeid = employeeid;
		this.employeename = employeename;
	}
	public int getEmployeeid()
	{
		return employeeid;
	}
	
	public void setEmployeeid(int employeeid)
	{
		this.employeeid = employeeid;
	}
	
	public String getEmployeename()
	{
		return employeename;
	}
	
	public void setEmployeename(String employeename)
	{
		this.employeename = employeename;
	}

	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + "]";
	}
	

}

    
