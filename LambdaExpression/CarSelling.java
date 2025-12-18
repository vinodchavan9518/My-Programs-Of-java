package LambdaExpression;

import java.util.function.Predicate;

public class CarSelling
{
      void main()
      {
    	  Predicate<Car> emp = emp1 -> 
    	  {
    		  if(emp1.price()<= 500000 && emp1.milage()>=20) 
    		  {
			  return true;
    		  }
    		  else
    		  {
    			  return false;
    		  }
    	  };
    	  
    	String brand = IO.readln("Enter a car brand : ");
    	double price = Double.parseDouble(IO.readln("Enter a car price : "));
    	int mileage = Integer.parseInt(IO.readln("Enter a milage : "));
    	
    	Car c = new Car(brand, price, mileage);
    	@SuppressWarnings("unused")
		boolean isValid = true;
    	if(isValid = emp.test(c)) 
    	{    	
    	IO.print(brand+" is eigible for sale");
    	}
    	
    	else 
    	{
    		IO.print(brand+" is not eigible for sale");
    	}
      }
}
record Car(String brand,double price,int milage){
	
}

    
}
