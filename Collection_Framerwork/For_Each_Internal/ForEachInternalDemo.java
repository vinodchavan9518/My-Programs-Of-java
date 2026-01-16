package Collection_Framerwork.For_Each_Internal;

import java.util.Vector;
//demonstrate the forEach method using lambda expression
public class ForEachInternalDemo {

public static void main(String[] args) {
		
		Vector<String>listOfCity=new Vector<>();
        listOfCity.add("Hyerabad");
        listOfCity.add("Kolkata");
        listOfCity.add("mumbai");
        listOfCity.add("dehi");
        listOfCity.add("pune");
        
        //Lambda
      Consumer<String>consumer=city->IO.println(city.toLowerCase());        
        
      listOfCity.forEach(consumer);
	}

}
