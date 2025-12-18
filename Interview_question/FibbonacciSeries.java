package Interview_question;

    import java.util.Scanner;
public class FibbonacciSeries {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;

        for(int i=1;i<n;i++)
        {
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }

sc.close();
    }
}
    

