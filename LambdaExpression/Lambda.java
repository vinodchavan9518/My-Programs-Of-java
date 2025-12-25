package LambdaExpression;

import java.util.Scanner;

interface Length
{
	int getLength(String  name);
}

public class Lambda {

	public static void main(String[] args) {
	
		
		Length length=str -> str.length();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String  name = sc.nextLine();
		
		System.out.println(length.getLength(name));

	}

}
