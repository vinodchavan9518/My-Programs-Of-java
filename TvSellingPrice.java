public class TvSellingPrice
{
	public static void main(String[]args)
	{
		int price=Integer.parseInt(args[0]);
		double profit=price*27/100;
		double TvSelling=profit+price;
		double GST=TvSelling*5/100;
		double finalprice=TvSelling+GST;

		System.out.println("The final price of the tv is "+finalprice);

}
}