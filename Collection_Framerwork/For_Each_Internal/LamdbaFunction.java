package Collection_Framerwork.For_Each_Internal;

import java.util.Vector;
//demonstrate the forEach method using lambda expression
public class LamdbaFunction {
    public static void main(String[] args) {
		
		Vector<String>listOfCity=new Vector<>();
        listOfCity.add("Hyerabad");
        listOfCity.add("jalna");
        listOfCity.add("mumbai");
        listOfCity.add("dehi");
        listOfCity.add("pune");
		
        
        listOfCity.forEach(city->IO.println(city.toUpperCase()));
	}

}

    

