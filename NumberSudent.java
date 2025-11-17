import java.util.Scanner;
public class NumberSudent

{
public static void main(String[]args)

	{
		Scanner cs = new Scanner(System.in);

		System.out.println("enter your roll:");
		int roll=Integer.parseInt(cs.nextLine());


		System.out.println("enter your name:");
		String name=cs.nextLine();


		System.out.println("enter your fees:");
		double fees=Double.parseDouble(cs.nextLine());



		System.out.println("your Roll Number is :"+roll);
		System.out.println("your name is :"+name);
		System.out.println("your fees is :"+fees);

		cs.close();


	}
}

