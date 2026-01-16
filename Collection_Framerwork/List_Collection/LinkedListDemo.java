package Collection_Framerwork.List_Collection;

import java.util.LinkedList;
//find LinkedList collection with user defined class object
public class  LinkedListDemo 
{
    public static void main(String[] args) {
		
		LinkedList<String>train=new LinkedList<>();
		
		train.add("Coach A");
		train.add("Coach B");
		train.add("Coach C");
		IO.println(" Initial  Train:"+train);
		
		train.addFirst("Engine:");
		IO.println("After adding Engine front:"+train);
		
		train.addLast("Gurad Coach");
		IO.println("After adding Gurad gurad Coatch at end:"+train);
		
		train.add(2,"Pantry Coatch");
		IO.println("After adding Prnty Coach First is Coatch middle: "+train);
		
		IO.println(" Reached to destination");
		train.removeFirst();
		IO.println("After removing first coach"+train);
		
		train.removeLast();
		IO.println("After removing last coach"+train);
		
		train.remove();
		IO.print("After removing pantry coach from middle:"+train);
				
	}

}


