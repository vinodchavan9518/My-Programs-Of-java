package ExecptionHandling.MarkerInteface;

class Product implements Cloneable 
{
	Integer id;
	String name;
	
	
	
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public void setName(String name) {
		this.name = name;
	}
	
	
}



public class CloneableDemo {

	void main()
	{
		try 
		{
			
		
		Product p1=new Product(111,"vinod");
		Product p2=(Product)p1.clone();
		IO.println("Before change");
		IO.print(p1+":"+p2);
		IO.print("After chage");
		p1.setId(222);
		p1.setName("Laptop");
	    IO.print(p2+":"+p2);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
	}

}
