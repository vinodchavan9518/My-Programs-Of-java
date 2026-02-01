package Map_Collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
// Demonstration of basic HashMap operations
public class HashMapDemo2 {
    void main()
{
	HashMap<Integer,String> Record=new HashMap<>();
	
	Record.put(101,"Vinod");
	Record.put(102,"vishal");
	Record.put(103,"karn");
	Record.put(104,"Vittal");
	Record.put(105,"aryan");
	
	
	IO.print("Studdent Record :"+Record);
	
	int seachId=104;
	String StudentName=Record.get(seachId);
	
	Optional<String>ofNullable=Optional.ofNullable(StudentName);
	IO.println(ofNullable.orElse("This id is not exitng"));
	
	IO.println(Record.put(103, "Rahul"));
	IO.println("Updated record:"+ofNullable);
	
	Record.remove(104);
	IO.println("REcord after removal:"+Record);
	
	
	int idToCheck=101;
	IO.println("DOes is" +idToCheck+ " exit" +Record.containsKey(idToCheck));
	
	
	String nameToCheck="aryan";
	IO.println("Does name " +nameToCheck+"exit" +Record.containsValue(nameToCheck));
	
	
	IO.println("Iterating through record");
	for(Map.Entry<Integer,String>entry:Record.entrySet())
{
	IO.println("ID:"+entry.getKey()+",Name:"+entry.getValue());
	
	
		
}
	Record.clear();
	IO.println("all record cleand:"+Record);{}
	
}
}

    

