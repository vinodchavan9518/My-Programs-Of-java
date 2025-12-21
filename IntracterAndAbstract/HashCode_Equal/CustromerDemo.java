package IntracterAndAbstract.HashCode_Equal;


     class custromer
{
	private int id;
	private String name;
	
	public custromer(int id,String name)
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
	int id1=this.id;
	String name1=this.name;
	
	custromer c2=(custromer)obj;
	
	int id2=c2.id;
	String name=c2.name;
	
	if(id==id2 && name.equals(name))
	{
		return true;
	}
	else
	{
		return false;
	}
	
 }

 }


 public class CustromerDemo {

	public static void main(String[] args)
	{
		
	custromer c1=new custromer(111,"vinod");
		custromer c2=new custromer(111,"vinod");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" :"+c2.hashCode());
		

	}

}



