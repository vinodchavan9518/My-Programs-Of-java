package Collection_Framerwork.List_Collection;

import java.util.LinkedList;
//find LinkedList collection with user defined class object
public class ListkedListDemo2 {
    
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();//generic
       list.add("Item 2");//2
       list.add("Item 3");//3
       list.add("Item 4");//3
       list.add("Item 5");//4
       list.add("Item 6");//5
       list.add("Item 7");//6
       
       
       
       list.add("Item 9");//10
       
       list.add(0,"Item 0");//0
       list.add(1,"Item 1");//1
		
       
       list.add(8,"Item 8");//8
       list.add(9,"Item 10");//9
       
       IO.println(list);
       
       list.add("Item 5");
		
       
       IO.println(list);
       list.remove();
       IO.println(list);
       
      list.removeFirst();
      IO.println(list);
      
      
      list.add(0,"Ajay");//set () will replace the existing value
      list.add(0,"Vaji");
      list.add(0,"Anand");
      list.add(0,"Aman");
      list.add(0,"suresh");
      list.add(0,"Ganesh");
      list.add(0,"Ramesh");
      list.forEach(x->IO.println(x));
      
	}

}

    

