package Interview_question;

  import java.util.Scanner;
public class FactorialNumber {

    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to find a factorial of:");
        int x=sc.nextInt();
        long factorial=1;

        for(int i=1;i<=x;i++)
        {
            factorial*=i;
        }
        System.out.println("Factorial of "+x+" is: "+factorial);
        sc.close();
    }

    
}  
