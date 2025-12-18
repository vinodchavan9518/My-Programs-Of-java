package Interview_question;

    public class Palindrome{
    public static void main(String []args)
    {
        int a= 121;

        int rev=0;

        for(int i=a;i!=0;i=i/10)
        {
            rev=rev*10+i%10;
            
        }
        
        if(a==rev)
        {
            System.out.println(rev +" Palindrome");
        }
        else
        {
            System.out.println(rev+"Not a Palindrome");
        }

    }
    
}
    
}
