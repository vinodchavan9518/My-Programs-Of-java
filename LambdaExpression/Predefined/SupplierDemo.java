package LambdaExpression.Predefined;

    import java.util.Scanner;
import java.util.function.Supplier;
record product(Integer id,String name,Double price) {}

public class SupplierDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Supplier<product> s3=() ->
		{
			System.out.println("Enter product Id:");
			int  id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Product Name");
			String  name=sc.nextLine();
			System.out.println("Enter Product price:");
			
			Double price=Double.parseDouble(sc.nextLine());
			
			return new product(id,name,price);
		};
		
		
		product Product=s3.get();
		System.out.println(Product);
		
	}

}

    

