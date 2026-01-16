package InterfaceAndAbstractMethod.AbstrAnoymousInnerclass;

import java.util.Vector;
import java.util.function.Consumer;
//demonstrate the forEach method using anonymous inner class
public class ForEachInternalDemo {
    
	public static void main(String[] args) {
		Vector<String>listOfCity=new Vector<>();
        listOfCity.add("Hyerabad");
        listOfCity.add("Kolkata");
        listOfCity.add("mumbai");
        listOfCity.add("dehi");
        listOfCity.add("pune");

        //Anonymous inner class for Consumer
        Consumer<String>consumer= new Consumer<>()
       {
        	public void accept(String city)
        	{
        		IO.println(city.toUpperCase());
        	}
        	
        		
       
       };
       listOfCity.forEach(consumer);
        		
	}

}

}
