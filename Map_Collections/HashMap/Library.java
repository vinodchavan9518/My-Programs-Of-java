package Map_Collections.HashMap;

import java.util.HashMap;
//find a simple library system using HashMap
public class Library {
    
    void main()
	{
		//Create a hashMap to Store book title and their availability (true=available,false=borrowed)
		HashMap<String,Boolean> library =new HashMap<>();
		library.put("core Java", true);
		library.put("Advanced java", true);
		library.put("HTML",false);
		library.put("JavaScript",true);
		
		//Display the initial library status
		IO.println("Initial lirary status:");
		library.forEach((k,v)->IO.println(k+":"+v));
		
		//Borrow a book
		String bookToBorrow ="Advanced java";
		
		if(library.containsKey(bookToBorrow) && library.get(bookToBorrow))
		{
			library.put(bookToBorrow, false);
			IO.println(bookToBorrow+ "Has borrowed successfully");
			
			
		}
		
		else
			
		{
			IO.println(bookToBorrow+"Book is not avaible for borrow");
		}
		IO.println("Check whic book return in larbrary:");
		String bookToReturn="HTML";
		if(library.containsKey(bookToReturn)&& library.get(bookToReturn))
		{
			library.put(bookToReturn, true);
			IO.println(bookToReturn+"Has returned by the use");
		}
		else
		{
			IO.println(bookToReturn+"is not int the library");
		}
		
		
		library.forEach((k,v)->IO.println(k+" :"+v));
		
		IO.println(" check avaible is book labraray:");
		//Check the availability of a book
		String bookToCheck= "JavaScript";
		
		if(library.containsKey(bookToCheck))
		{
			String availability=library.get(bookToCheck)?"available":"borrowed";
			IO.println(bookToCheck+"Books is "+availability+".");
		}
		else
		{
			IO.println(bookToCheck+"Is not in the library");
		}
		
		//Display the final library status
		
		IO.println(" final library status details:");
		for(HashMap.Entry<String,Boolean>entry:library.entrySet())
		{
			String status=entry.getValue()?"Available":"Borrowed";
			IO.println("Book:"+entry.getKey()+",Status:"+status);
		}
	}

}

}
