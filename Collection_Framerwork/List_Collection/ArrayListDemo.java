package Collection_Framerwork.List_Collection;

import java.util.List;
import java.util.ArrayList;
//find ArrayList collection with user defined class object
record Professor(String name,String specilization)
{
	
}

class  Department
{
	private String DeptName;
	private List<Professor>listOfPrefessor;
	
	public Department(String deptName)
	{
		this.DeptName=deptName;
		listOfPrefessor=new ArrayList<>();
	}
	
	public String getDeptName()
	{
		return this.DeptName;
	}
	
	public void addProfessor(Professor pro)
	{
		listOfPrefessor.add(pro);
		
	}
	public List<Professor>getListProfessors()
	{
		return this.listOfPrefessor;
	}
}







public class ArrayListDemo {
    public static void main(String[] args) {
		Department cs=new Department("Computer Science");
		cs.addProfessor(new Professor(" James", "Java"));
		cs.addProfessor(new Professor(" time berners", "html"));
		cs.addProfessor(new Professor(" denis", "c languang"));
		cs.addProfessor(new Professor(" James", "Java"));
		
		IO.println(" Proferessoe in"+cs.getDeptName()+"Departement :");
       List<Professor>lisProfessors=cs.getListProfessors();
       
       for(Professor pro:lisProfessors)
       {
    	   IO.println(pro);
       }
		
		
	}

}

 

