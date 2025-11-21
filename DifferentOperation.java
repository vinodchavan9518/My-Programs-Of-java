public class DifferentOperation

{
	public static void main(String[]args)
	{
		if(args.length==0)
		{
			System.out.println("No argument provided!");
		}
		else if(args.length==1)
		{
			int firstArgu=Integer.parseInt(args[0]);
			System.out.println("The  square of "+(firstArgu*firstArgu));
		}
		else if (args.length==2)

		{
			int firstArgu=Integer.parseInt(args[0]);
			int secondArgu=Integer.parseInt(args[1]);
			System.out.println("The sum of number"+(firstArgu+firstArgu)+"the product of number"+(firstArgu*secondArgu));

		}
		else if(args.length >2)
		{
			int firstArgu=Integer.parseInt(args[0]);
			int secondArgu=Integer.parseInt(args[1]);
			int thirdArgu=Integer.parseInt(args[2]);
			int fourthArgu=Integer.parseInt(args[3]);

			System.out.println("The sum of the all number"+(firstArgu+secondArgu+thirdArgu+fourthArgu));
		}
	}
}

    
