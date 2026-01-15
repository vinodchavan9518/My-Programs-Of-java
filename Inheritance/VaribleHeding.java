package Inheritance;

class Employee
{
	protected double salary = 700000;
}
class Developer extends Employee
{
	protected double salary = 900000;
	
	public void getSalaryInfo()
	{
		System.err.println("Employee Salary id :"+super.salary);
		System.err.println("Developer  Salary id :"+this.salary);

	}
}


public class VaribleHeding {

	public static void main(String[] args) {
		
		Developer developer = new Developer();
		developer.getSalaryInfo();

	}

}
