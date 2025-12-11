package LambdaExpression;

 import java.util.Scanner;
import java.util.function.Supplier;
record product(Integer id,String name,Double price) {}

public class SupplierDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Supplier<product> s3=() ->
		{
			var id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter product Id:");
			var name=sc.nextLine();
			System.out.println("Enter Product Name");
			var price=Double.parseDouble(sc.nextLine());
			System.out.println("Enter Product price:");
			
			return new product(id,name,price);
		};
		
		product Product=s3.get();
		System.out.println(Product);
		
	}

}
   

