package IntracterAndAbstract.HashCode_Equal;


    
class Custromer 
{
	private int id;
	private String name;
	
	public Custromer(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
}
public class Customer {

	public static void main(String[] args) {
		Custromer c1=new Custromer(122,"vinod");
		Custromer c2=new Custromer(122,"vinod");
		
		System.out.println(c1==c2);//false
		System.out.println(c1.equals(c2));//false

	}

}


