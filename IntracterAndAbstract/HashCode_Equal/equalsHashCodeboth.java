package IntracterAndAbstract.HashCode_Equal;


    
    
class Prodect 
{
	private int id;
	private String name;
	
	
	public Prodect(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	}
	public int hashCode()
	{
		return this.id;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Prodect)
		{
			Prodect p2=(Prodect)obj;
			
			
			if(this.id==p2.id  && this.name.equals(p2.name))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			System.out.println("object are not conprable object");
			return false;
		}
	}
}



public class equalsHashCodeboth {

	public static void main(String[] args) {
		 Prodect p1=new Prodect(111, "vinod");
		 Prodect p2=new Prodect(111, "vinod");
		 
		 
		 System.out.println(p1.equals(p2));
		 System.out.println(p1.hashCode()+":"+p2.hashCode());
		 
		 System.out.println("==============================");
             
		 Prodect p3=new Prodect(222, "vishal");
		 Student s1=new Student(333,"Rav");
		
	}

}
class Student
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

