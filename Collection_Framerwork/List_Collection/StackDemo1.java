package Collection_Framerwork.List_Collection;

import java.util.Stack;
//find stack operations using Stack class
public class StackDemo1 {
    public static void main(String[] args) 
	{
		Stack<Integer>s1=new Stack<>();
		s1.add(12);
		s1.add(29);
		s1.forEach(x->IO.println(x));
		
		Stack<String>s2=new Stack<>();
		s2.add("C language");
		s2.add("is");
		s2.add("java");
		s2.add("HTML");
		s2.forEach(x->IO.println(x));
		IO.println("Stack:"+s2);
		
		
		
		IO.println("============================");
		String fruit=s2.peek();
		
		IO.println("Elements at top:"+fruit);//html
		IO.println("Satck element are:"+s2);//tostring
		
		
		IO.println("+++++++++++++++++++++++++++++++++");
		IO.println("Offset position is:"+s2.search("is"));//3
		IO.println("Offset position is:"+s2.search("langueage"));//-1
		IO.println("Offset position is:"+s2.search("HTML"));
		
		IO.println("Is satck empty"+s2.empty());//false
		IO.println("Interst postion is:"+s2.indexOf("is"));//1
		IO.println("Fetch only element top:"+s2.peek());//html
		IO.println(""+s2.pop());//html
		IO.println(""+s2.capacity());//10
		
		Stack<Character>s3=new Stack<>();
		s3.add('P');
		s3.add('B');
		s3.add('C');
		s3.forEach(x->IO.println(x));
		
		Stack<Double>s4=new Stack<>();
		s4.add(12.9);
		s4.add(23.9);
		s4.forEach(x->IO.println(x));
		
		
		
		
		

	}

}

}
