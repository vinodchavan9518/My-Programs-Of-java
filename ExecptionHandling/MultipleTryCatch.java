package ExecptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {
    

			void main(){
				
				try
				{
					String str ="java";
					Integer val=Integer.valueOf(str);
					IO.println(val);
				}
					
			   //catch(Exception e)
				catch(NumberFormatException e)
				{
						IO.println("Number is not in proper fomat");
				}
				try 
				{
					Object obj[]=new Integer[3];
					obj[0]=100;
					obj[1]=200;
					obj[2]=true;
					
				}
				catch(ArrayStoreException e)
				
				{
					IO.println("Interting Illeal data in Array");
				}
				try 
				{
					Scanner sc=new Scanner(System.in);
					IO.println("Enter your Age:");
					int age=sc.nextInt();
					IO.println("Your is age:"+age);
				}
				catch (InputMismatchException e)
				
				{
					IO.println("Input data is not in vaild format:");
					
					}
				}

			

}


