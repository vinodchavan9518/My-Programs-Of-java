package InterfaceAndAbstract.HashCode_Equal;


class Product

{
	private int productId;
	private String productName;
	
	public Product(int productId,String productName) {
		super();
		this.productId=productId;
		this.productName=productName;
		
	}
	public int hashCode()
	{
		return this.productId;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Product)
		{
			Product p2=(Product)obj;
			
			if(this.productId==p2.productId && this.productName.equals(p2.productName))
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
			return false;
		}
		
	}
	
	
}




public class ProductDemo {

	public static void main(String[] args)
	{
		Product p1=new Product(12,"vinod");
		Product p2=new Product (13,"sctton");
		
		 IO.println(p1.equals(p2));
		 IO.println(p1.hashCode()+":"+p2.hashCode());
		 
	}

}
