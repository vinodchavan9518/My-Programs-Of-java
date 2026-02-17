package Java8Features.OptionalClass;

import java.util.Optional;

public class optionalDemo {
    

    void main()
	{
		String str="vinod";
		Optional<String> ctr=Optional.ofNullable(str);
		//(isPresent) container have same values  true ,and are not is value diff Verify false 
		if(ctr.isPresent())
		{
			//(get) meaning is values is available in String are not check  
			IO.println("Value in the container:"+ctr.get());
		}
		else
		{
			System.err.print("NO  value in the container");
		}
		
		IO.println("================================");
		
		Integer roll=null;
		Optional<Integer> ct=Optional.ofNullable(roll);
		//ava.util.NoSuchElementException
		IO.println("Value in the container: "+ct.get());
		
		
	}
	
	
}
