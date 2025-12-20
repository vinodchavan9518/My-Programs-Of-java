package LambdaExpression.Predefined;


    import java.util.Scanner;

import java.util.function.Predicate;




public class PredicateDe {

	public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);
		Predicate<Integer>p1=age->age>=18;
		System.out.println("Enter your Age:");
		int myAge=Integer.parseInt(sc.nextLine());
		System.out.println("My age is:"+myAge+" am I eligible for voting:"+p1.test(myAge));
		

	}

}

    

