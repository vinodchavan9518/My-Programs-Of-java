package Collection_Framerwork.Set_Collection;

import java.util.LinkedHashSet;
//find the insertion order using linkedHashSet
public class LinkedSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linked=new LinkedHashSet<>();
		linked.add(10);
		linked.add(3);
		linked.add(15);
		linked.add(30);
		linked.add(40);
		linked.add(5);
		
		IO.println("LinkedHashSet Elements :"+linked);
		IO.println("LinkedHashSet Size :"+linked.size());
		
		int elementToCheck=15;
		if(linked.contains(elementToCheck))
		{
			IO.println(elementToCheck+"is preesnt itn the linkedHashSet");
			
		}
		else
		{
			IO.println(elementToCheck+"Is not present in the linkedHashSet");
			
		}
		int elementToRemove=10;
		linked.remove(elementToRemove);
		IO.println("After removing"+elementToRemove+"LnkedHashSet Element:"+linked);
		
		linked.clear();
		IO.println("After cleaning,linkedHashSet element:"+linked);//[]
	}

}

    
    

