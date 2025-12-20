package LambdaExpression.Predefined;

//import java.util.function.BiPredicate;


    interface BiPredicate<T,U>
{
	boolean test(T t,U u );
}

public class BiPredicateDemo {

	public static void main(String[] args) {
		 
		BiPredicate<String,Integer> filter=(x,y) ->
		{
			return x.length()==y;
		};
		
		boolean result=filter.test("RAvi",3);
		System.out.println(result);
		
		result=filter.test("Hydreabad", 100);
		System.out.println(result);

	}

    
}
