package Java8Features.OptionalClass;

import java.util.ArrayList;
import java.util.Optional;

public class optionalOrElse {
    public static void main(String[] args) {
        
        
		ArrayList<Optional<String>> listOfCity=new ArrayList<>();
		// return the optional object specified value that non-null value because it does not container any container        
		listOfCity.add(Optional.of("Pune"));
		listOfCity.add(Optional.of("Mumbai"));
		listOfCity.add(Optional.of("Bglr"));
		listOfCity.add(Optional.of("Jalna"));
		listOfCity.add(Optional.of("hyd"));
		//listOfCity.add(Optional.of(null));//.NullPointerException
	    
	    listOfCity.add(Optional.empty());//insert of null use this
		
		for(Optional<String> city:listOfCity)
		{
			if(city.isPresent())
			{
				IO.println("City Name is :"+city.get());
			}
			else
			{
				System.err.println("No value in the container");
			}
		}
		
		
		
		
		
       IO.println("=========Method OrElse==================");
	     String name="vinod";
		Optional<String> ctr=Optional.of(name);
		
	//(OrElse) return is value available otherwise then specified default value
		String value=ctr.orElse(" No value is present");
		IO.println(value);
	}
}

