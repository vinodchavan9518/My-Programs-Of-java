package LambdaExpression.Predefined;

    import java.util.function.Consumer;

record Product(Integer id,String name,Double price)
{
	
}

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer <Integer>c1=num->System.out.println("Integer Object:"+num);
		c1.accept(12);
		
		Consumer<Double>c2=db1->System.out.println("Double Object"+db1);
		c2.accept(23d);
		
		Consumer<String>c3=str->System.out.println("Stirng Object"+str);
		c3.accept(new String("vinod"));
		
		Consumer<Product>c4=prod->System.out.println("Product Object:"+prod);
		c4.accept(new Product(1,"Laptop",96000d));		

	}

}

    

