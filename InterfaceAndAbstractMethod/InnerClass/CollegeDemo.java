package InterfaceAndAbstractMethod.InnerClass;


  
class University
{
	private String name;
	
	public University(String name)
	{
		this.name=name;
		
	}
	public void displayUniversityName()
	{
		IO.println("University name:"+this.name);
	}
	
	public class Department
	{
		private String name;
		private String headOfDepartment;
		
		public Department(String name,String headOfDepartement)
		{
			this.name=name;
			this.headOfDepartment=headOfDepartement;
		}
		
		//Method to display department details
		public void dispalyDepartementDetails()
		{
			displayUniversityName();
			IO.print("Department name:"+name);
			IO.println("Head of Department:"+headOfDepartment);
		}
	}
}



public class CollegeDemo {

	public static void main(String[] args) {
		
		University university=new University("JNIU");
		University.Department cs = university.new Department("Computer Sceince", "DR.john");
		University.Department me= university.new Department("Mehicle Engineering ", "DR.scott");
		University.Department ee =university.new Department("Electrial Engineering ", "dr.mohon");
		
		cs.dispalyDepartementDetails();
		me.dispalyDepartementDetails();
		ee.dispalyDepartementDetails();

	}

}
  

