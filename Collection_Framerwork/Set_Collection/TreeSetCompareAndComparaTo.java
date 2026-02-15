package Collection_Framerwork.Set_Collection;

import java.util.TreeSet;
//find the sorting order based on the id,name and price using compare and compareTo method
record Product (Integer id,String name,Double price)
{

}
public class TreeSetCompareAndComparaTo {
    public static void main(String[] args) {
        
        TreeSet<Product> tp=new TreeSet<>((p1,p2)->p1.id().compareTo(p2.id()));
		tp.add(new Product(999, "Mobile", 200000d));
		tp.add(new Product(555, "Laptop", 245000d));
		tp.add(new Product(222, "tab", 30000d));
		tp.add(new Product(666, "Camera", 10000d));
	  
		IO.println("Sorting  based on the ID:");
		tp.forEach(IO::println);
	
		
		
		TreeSet<Product> Tp=new TreeSet<>((p1,p2)->p1.name().compareTo(p2.name()));
		Tp.add(new Product(888,"Mobile",35000d));
		Tp.add(new Product(222,"Aap",   28000d));
		Tp.add(new Product(999,"Camera",2000d));
		
		IO.print("Sorting based on the Name:\n");
		Tp.forEach(IO::println);
		
		TreeSet<Product> Tp1=new TreeSet<>((p1,p2)->Double.compare(p2.price(),p1.price()));
		Tp1.add(new Product(888,"Mobile",35000d));
		Tp1.add(new Product(222,"Tab",28000d));
		Tp1.add(new Product(111,"camera",20000d));
		
		IO.println("Sorting based on the price:");
		Tp1.forEach(IO::println);
		
		TreeSet<Product> Tp2=new TreeSet<>((p1,p2)->Double.compare(p1.price(),p2.price()));
		Tp2.add(new Product(888,"Mobile",35000d));
		Tp2.add(new Product(222,"Tab",28000d));
		Tp2.add(new Product(111,"camera",20000d));
		
		IO.println("Sorting Asending order based on the price:");
		Tp2.forEach(IO::println);
	}


}
