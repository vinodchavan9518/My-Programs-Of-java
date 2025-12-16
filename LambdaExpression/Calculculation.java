package LambdaExpression;
import java.util.function.Predicate;

public class Calculculation {

    public static void main(String[]args)
    {
        int num=Integer.parseInt(IO.readln("enter anumber:"));
        IO.println("Sample number :"+num);
        Predicate<Integer>num1=number->number % 2==0;
        IO.println(num+"is a even "+testPredicate(num,num1));

        Predicate<Integer>num2=number->number>10;
        IO.println(num+"is greater than 10:"+testPredicate(num,num1));

       Predicate<Integer>num3=number ->
       {
        int count =0;
        for(int i=1;i<=number;i++)
        {
            count=0;
            for(int j=1;j<=number;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
        }
        if(count==2)
        {
            return true;

        }
        else
        {
            return false;
        }
       };
       IO.println(num+"is aprime"+testPredicate(num,num3) );
    }
    public static boolean testPredicate(int num,Predicate<Integer>p)

    {
        return result.test(num);
    }

    }
    

