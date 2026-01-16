package Collection_Framerwork.Comparable_Comparator;

import java.util.Collections;
import java.util.Vector;
//find the vector using custom sorting based on id and name
record Product(Integer id,String name,Double price)
{

}
public class ComparatorProduct {
    public static void main(String[] args) {
		Vector<Product>listOfProducts=new Vector<>();
		listOfProducts.add(new Product(222,"mobile",145678d));
		listOfProducts.add(new Product(666,"laptop",35678d));
		listOfProducts.add(new Product(111,"camere",5678d));
		listOfProducts.add(new Product(333,"tab",45678d));

		
		IO.print(" Sorting based on product ID:");
		Collections.sort(listOfProducts,(p1,p2)->Integer.compare(p1.id(),p2.id()));
		
		for(Product product :listOfProducts)
		{
			IO.println(product);
		}
		
		IO.print(" Sorting based on the product name:");
		Collections.sort(listOfProducts,(p1,p2)->Double.compare(p1.price(),p2.price()));
		
		for(Product product :listOfProducts)
		{
			IO.println(product);
		}
		
	}

}

    

