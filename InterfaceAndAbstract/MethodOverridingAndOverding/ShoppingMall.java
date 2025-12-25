package InterfaceAndAbstract.MethodOverridingAndOverding;


import java.util.Scanner;

public class ShoppingMall
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
    System.out.println("WELcome to Hydrabad Mall :");
    System.out.println("Please select the Custromer type to get additional discount:");
    System.out.println("\t\t\t  1)General Customer:");
    
    System.out.println("\t\t\t 2)Prime Customer:" );
    System.out.println("\t\t\t  3)VIP Custromer:");
    
    Customer cust =null;
    System.out.println("Enter your choice:");
    int choice = Integer.parseInt(sc.nextLine());
    
    
    switch(choice)
    {
    case 1 ->
    {
    	System.out.println("Enter Customer Name:");
    	String name =sc.nextLine();
    	
    	cust=new GenderalCustromer(name);
    	
    	System.out.println("Enter number of item:");
    	int noOfItem=Integer.parseInt(sc.nextLine());
    	
    	
    	double itemPrice[]=new double[noOfItem];
    	System.out.println("Please Enter the Item Name and Price:");
    	
    	
    	for(int i=0;i<itemPrice.length;i++)
    	{
    		System.out.println((i+1)+"Item Name:");
    		String itemName=sc.nextLine();
    		System.out.println("Item price:");
    		double itemprice1=Double.parseDouble(sc.nextLine());
    		itemPrice[i] =itemprice1;
    	}
    	generateBill(cust,itemPrice);
    }
    case 2 ->
    {
    	System.out.println("Enter Customer Name:");
    	String name =sc.nextLine();
    	
    	cust=new GenderalCustromer(name);
    	
    	System.out.println("Enter number of item:");
    	int noOfItem=Integer.parseInt(sc.nextLine());
    	
    	double itemprice1[]=new double[noOfItem];
    	
    	System.out.println("Please Enter the Item Name and Price:");
    	
    	
    	for(int i=0;i<itemprice1.length;i++)
    	{
    		System.out.println((i+1)+")Item Name:");
    		String itemName=sc.nextLine();
    		System.out.println("Item price:");
    		double itemPrice=Double.parseDouble(sc.nextLine());
    	   itemprice1[i] =itemPrice;
    	
    }
    	generateBill(cust,itemprice1);
    	
    	
    }
    case 3 ->
    {
    	String name =sc.nextLine();
    	System.out.println("Enter Customer Name:");
    	cust=new GenderalCustromer(name);
    	System.out.println("Enter number of item:");
    	int noOfItem=Integer.parseInt(sc.nextLine());
    	
    	double itemprice1[]=new double[noOfItem];
    	System.out.println("Please Enter the Item Name and Price:");
    	
    	
    	for(int i=0;i<itemprice1.length;i++)
    	{
    		System.out.println((i+1)+"Item Name:");
    		String itemName=sc.nextLine();
    		System.out.println("Item price:");
    		double itemPrice=Double.parseDouble(sc.nextLine());
    		itemprice1[i] =itemPrice;
    	
    }
    	generateBill(cust,itemprice1);
    
    }
    default ->System.out.println("Invalid choice");
    }
	sc.close();
	}
	public static void generateBill( Customer cust,double ...price)
	{
		cust.calculateBill(price);
		System.out.println("\nWelcome to Hydrabad Mall:");
		cust.printDetails();
	}
}
 class Customer {
	protected String name;
	protected double total;
	
	public Customer(String name)
	{
		super();
		if(name  ==null || name.isBlank())
		{
			System.out.println("Custromer Name cannot be blank");
			System.exit(0);
		}
		this.name=name;
	}
	

	

	public double calculateBill(double ...prices)
	{
		for(double price:prices)
		{
			if(price<0)
			{
				System.out.println("Price cannot be negative");
				System.exit(0);
			}
			total=total+price;
		}
		return total;
	}
	public void printDetails()
	{
		System.out.println("Custromer Name is:"+this.name);
		System.out.println("Total price is :"+this.total);
		System.out.println("No discount for general customer..");
	}

}
 class GenderalCustromer extends Customer {
	
	public GenderalCustromer(String name)
	{
		super(name);
	}
public double calculateBill(double ...prices)
{
	total = super.calculateBill(prices);
	return total;
}
}
 class PrimeCustomer extends Customer {
	
	protected double discountRate=10.0;
	public PrimeCustomer(String name) {
		super(name);
		
	}
	public double calculateBill(double ...prices)
	{
		total=super.calculateBill(prices);
		return total;
	}
	public void printDetails()
	{
		double discount=(total*discountRate)/100;
		double finalAmount=total-discount;
		
		System.out.println("Customer NAme is:"+name);
		System.out.println("Total amount is:"+this.total);
		System.out.println("Discount amount is:"+discount);
		System.out.println("After discount final amount is:"+finalAmount);
	}

	

}
 class VIPCustomer extends Customer {
	protected double discountRate=15.0;

	public VIPCustomer(String name) {
		super(name);
		
	}

	public double calculateBill(double ...prices)
	{
		total=super.calculateBill(prices);
		return total;
	}
	public void printDetais()
	{
		double discount=(total*discountRate)/100;
		double finalAmount=total-discount;
		
		System.out.println("Customer Name is :"+name);
		System.out.println("Total amount is   :"+this.total);
		System.out.println("Discount amount  is :"+discount);
		System.out.println("After discount final amount  is :"+finalAmount);
	}
}

	
    
