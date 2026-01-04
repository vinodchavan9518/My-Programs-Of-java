package ExecptionHandling;


    import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			IO.print("Enter your Roll number:");
			int roll=sc.nextInt();
			IO.print("Your Roll is:"+roll);
			
		}
		catch(InputMismatchException e)
		{
			System.err.println("Provide vaild input");
			
			try {
				IO.print(10/0);
			}
			catch(ArithmeticException e1)
			{
				System.err.println("Divided by zero problem");
			}
		}
		finally
		{
			IO.print("FInally Block");
			
			try {
				Object []obj=new Integer[3];
				obj[0]=12;
				obj[1]=45;
				obj[3]="90";
				
				
			}
			catch(ArrayStoreException e)
			{
				System.out.println("Invild element so cant store in array");
			}
		}
		
	}
	

}


