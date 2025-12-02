public class PalindromeNumber
{
	public static void main(String[]args)
	{
		int num=Integer.parseInt(args[0]);
		int tem=num;
		int rev=0;
		while(tem!=0)
		{
			int r=tem%10;
		rev = rev*10+r;
		tem/=10;
		}
		if(rev==num)
		{
			System.out.println("palindrone="+num);
		}
			else{
				System.out.println("Not a palindrome ="+num);
			}
	}
}

