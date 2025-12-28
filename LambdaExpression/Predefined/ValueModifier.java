package LambdaExpression.Predefined;

import java.util.function.Consumer;

public class ValueModifier {
    public static void main(String[] args) 
	{
		int i=Integer.parseInt(IO.readln("Enter a value:"));
		
		Consumer<Integer>doublevalue =n->IO.println("After doubling the value:"+(n+n));
		
		Consumer<Integer>incrementBy=n->IO.println("After incrementing the value by:"+(n+3));
		
		Consumer<Integer>squaring=n->IO.println(" After squaring the value:"+n*n);
		
		IO.println("Original value:"+i);
		modifyValue(i,doublevalue);
		modifyValue(i, incrementBy);
		//modifyValue(i, squaring);
		if(i<0)
		{    }          
		else
		{
			modifyValue(i, squaring);
		}
		
	}
 
	public static void modifyValue(int Value,Consumer<Integer>p)
	{
	 
		p.accept(Value);
	}
}

    

