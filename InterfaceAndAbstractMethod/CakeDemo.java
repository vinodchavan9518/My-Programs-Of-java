package InterfaceAndAbstractMethod;
import java.util.Scanner;

public class CakeDemo
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		OrderedCake order=new OrderedCake();
		System.out.println(order);
		OrderedCake order1=new OrderedCake("Round","Chocolate",4);
		System.out.println(order1);
		
		OrderedCake order2= new OrderedCake("Square","pineapple",3,"Happy Birthday message");
				
		
		
	}
}
 class Cake {
	
	private String shape;
	private String flavor;
	private int quatity;
	
	public static double price=400;

	public Cake(String shape, String flavor, int quatity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quatity = quatity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		Cake.price = price;
	}

	@Override
	public String toString() {
		return "A"+shape+" "+flavor+" cake of "+quatity+" KG is redy @ Rs."+quatity*price;
	}

}

 class OrderedCake extends Cake 
 {
	 
	private String message;
	
	
	public OrderedCake()
	{
		super("round","Vanilla",1);
		
		
	}
	public OrderedCake(String shape,String flavor,int quantity)
	{
		super(shape,flavor,quantity);
		
		
		
	}
	public OrderedCake(String shape, String flavor, int quatity, String message) {
		super(shape, flavor, quatity);
		this.message = message;
	}
	
 
	
}


