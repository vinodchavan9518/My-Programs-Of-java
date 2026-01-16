package Collection_Framerwork.List_Collection;

import java.util.LinkedList;
import java.util.List;
//find LinkedList collection with user defined class object
public class LiskedListDemo1 {
    public static void main(String[] args) {
		
		List<Integer>linkedList=new LinkedList<>();
		
		while(true)
		{
			IO.println("Linked list:"+linkedList);
			IO.println("1.Insert Element");
			IO.println("2.Delete Element");
			IO.println("3.Display Element");
			IO.println("4.Exit");
			IO.print(" Enter your choice:");
			int choice=Integer.parseInt(IO.readln());
			
			switch(choice)
			{
			case 1->
			{
				IO.println(" Elements the element to insert:");
				int elementIoAdd=Integer.parseInt(IO.readln());
				linkedList.add(elementIoAdd);
				break;
			}
			case 2->
			{
				if(linkedList.isEmpty())
				{
					IO.println("linked List is empty.Nothing to delete");
					
				}
				else
				{
					IO.println("Enter the element to delete:");
					int elementToDelete=Integer.parseInt(IO.readln());
					boolean isRemove=linkedList.remove(Integer.valueOf(elementToDelete));
					if(isRemove)
					{
						IO.println(elementToDelete+"element deleted");
					}
					else
					{
						IO.println(elementToDelete+"Not deleted");
						break;
					}
				
				}
				}
				
				case 3->
				{
					IO.println("elements in the linked list.");
					linkedList.forEach(System.out::println);
					break;
				}
				case 4->
				{
					IO.println("exting the program");
					System.exit(0);
				}
				
					default->
						IO.println("Invalid choice please try again");
				}
			}
			
				
			
			
		}
		}
	



    

