package Java8Features.ArbitraryRefence;

import java.util.TreeSet;
import java.util.function.Function;
//find the method reference for the following code
public class ArbitrayDemo {
    
    void main()
	{
		Function<String, String>fn1=String::toUpperCase;
		IO.println(fn1.apply("Java"));
		IO.println(fn1.apply("Stream"));
		
		IO.println("==================");
		
		TreeSet<String>ts=new TreeSet<>(String::compareTo);
		ts.add("S");
		ts.add("W");
		ts.add("K");
		
		IO.println(ts);
		IO.println("==================");
		TreeSet<String> ts2=new TreeSet<>((s1,s2)->s2.compareTo(s1));
		ts2.add("A");
		ts2.add("B");
		ts2.add("C");
		IO.println(ts2);
		
	}

}


