package Interview_question;

public class ArmstrongNumber {
    public static void main(String []args)
    {
        int num=153;

        int sum=0;
            int temp=num;
        while(num!=0)
        {
            int digit =num%10;
            int add=1;
           for(int i=1;i<=3;i++)
           {
                 add*=digit;
           }
           sum=sum+add;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==temp)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
    
}
    

