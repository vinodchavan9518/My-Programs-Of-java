package Collection_Framerwork.GenericType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class BoundExample
{
	public static void printNumber(List<?extends Number> list)
	{
		for(Number n:list)
		{
			IO.println(n);
		}
	}
	public static void addNumber(List<? super Integer>list)
	{
		list.add(1999);
		list.add(2000);
		list.add(6000);
	}
}

public class Test1 {
    void main()
	{
		//Upper Bound
		List<Integer> intList=Arrays.asList(12,23,34);
		List<Double> doubleList=Arrays.asList(10.2,20.1);
		
		IO.println("Printing INteger");
		BoundExample.printNumber(intList);
		
		IO.println("printng double number");
		BoundExample.printNumber(doubleList);
		
		//not allowed because character not sub class of number
		/*
		List<Character> charList= Arrays.asList('n','n');
		IO.println("Printing character");
		BoundExample.printNumber(charList);
		*/
		
		//lower Bound
		List<Number> numList=new ArrayList<>();
		BoundExample.addNumber(numList);
		IO.println("Object after adding"+numList);
		
		List<Object> objList=new ArrayList<>();
		BoundExample.addNumber(objList);
		IO.println("Object after adding:"+objList);
		
	}

}

    

