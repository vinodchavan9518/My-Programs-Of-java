package Record;

public class StudentsDemo {
    
	public static void main(String[] args) {
		
		Students s=new Students(12,"vinod");
		System.out.println(s);
		s.m1();
		s.m2();

	}

}
 record Students(int id,String name ) 
{
	void m1()
	{
		System.out.println("Non-static method ");
	}
	static 
	{
		System.out.println("static method");
	}
	static void m2()
	{
		System.out.println("static field ");
	}
	
	 public String details()
	 {
		 return "ID:"+id+",Name:"+name;
	 }
	
	 
	

}



