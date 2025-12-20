package LambdaExpression.Predefined;
    import java.util.Scanner;
import java.util.function.Function;

public class FuctionDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter your Name");
		 Function<String,Boolean> fn2=str -> str.startsWith("R");
		 String name=sc.nextLine();
				 
			System.out.println("IS" +name+ "Start with Character'R'"+fn2.apply(name));
			
	}
	
	

}

    

