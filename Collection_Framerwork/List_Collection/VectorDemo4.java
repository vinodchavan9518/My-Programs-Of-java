package Collection_Framerwork.List_Collection;

import java.util.Vector;
//Simple to-do list application using Vector
public class VectorDemo4 {
    public static void main(String[] args) {
		
		Vector<String>toDoList=new Vector<>();
		
		int choice;
		do
		{
			IO.println(" TO do list Menu:");
			IO.println("1.Add Task:");
			IO.println("2.View Tasks:");
			IO.println(" 3.Marks task as Completed:");
			IO.println("4. Exit");
			
			IO.println("Enter your choice:");
			
			choice=Integer.parseInt(IO.readln());
			
			switch(choice)
			{
			case 1->
			{
				IO.println("Enter task description:");
				String task=IO.readln();
				toDoList.add(task);
				IO.println(" Task added successfully!\n");
			}
			
			case 2->
			{
				IO.println("To do list:");
				for(int i=0;i<toDoList.size();i++)
				{
					IO.println((i+1)+"."+toDoList.get(i));
					
				}
				IO.println();
				
			}
			case 3->
			{
				IO.println("Enter task number to mark as completed ");
				int taskNumber=Integer.parseInt(IO.readln());
				
				if(taskNumber>=1 && taskNumber <=toDoList.size())
				{
					String completedTask=toDoList.remove(taskNumber-1);
					IO.println("task marked as completed:"+completedTask+"\n");
				}
				else
				{
					IO.println(" Invaild task number\n");
				}
			}
			case 4->
			{
				IO.println(" Exiting toDo list Application Goodbye");
				
			}
			default->
			IO.println(" Exiting toDo list application vaild option.\n");
			}
		}
		while(choice!=4);
		
		

	}

}


