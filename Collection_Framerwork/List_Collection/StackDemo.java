package Collection_Framerwork.List_Collection;

import java.util.EmptyStackException;
import java.util.Stack;
//find stack operations using Stack class
public class StackDemo {
    public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>();
		
		try
		{
			s.push(12);
			s.push(18);
			s.push(22);
			s.push(42);
			s.push(92);
			s.push(72);
			s.push(52);
			IO.println(s.toString());
			
			IO.println(" Fetch the elements usingn pop method ");
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
		
			
			IO.println("After deletion element are"+s);
			IO.println(" Afete the is stack empty:"+s.empty());
			
		}
		catch(EmptyStackException e)
		{
			e.printStackTrace();
		}
		
	

	}

}

}
