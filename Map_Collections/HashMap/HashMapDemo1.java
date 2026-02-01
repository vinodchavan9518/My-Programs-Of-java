package Map_Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Demonstration of HashMap with computeIfAbsent and computeIfPresent
public class HashMapDemo1 {
    
    void main()
	{
		Map<String,List<String>> subject=new HashMap<>();
		subject.computeIfAbsent("Scott", key->new ArrayList<String>()).add("Java");
		
		subject.computeIfAbsent("Scott", key ->new ArrayList<String>()).add(" Adv Java ");
		
		subject.computeIfAbsent("Vinod", key->new ArrayList<String>()).add("HTML");
		
		subject.computeIfAbsent("Vinod", key->new ArrayList<String>()).add("Js");
		
		subject.computeIfAbsent("Vishal", Key->new ArrayList<String>()).add("Css");
		
		IO.println(subject);
		IO.println("================================");
		
		//Insert more subject by using computeIfPresent()
		subject.computeIfPresent("Scott", (K,v)->{
			v.add("Spring");
			return v;
		});
		
		subject.computeIfPresent("Vinod", (k,v)->{v.add("React");
		return v;});
		IO.println(subject);
		
		IO.println("The addig subject ===========================>:");
		
		subject.computeIfPresent("Vishal", (k,v)->{v.add("Oracle");
		return v;
		});
		IO.println(subject);
	}

}



