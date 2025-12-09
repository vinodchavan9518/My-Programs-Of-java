package Hierarchicanheritance;

public class ElectericityBillDemo {

	public static void main(String[]args)
	{
		int UnitOfBill=Integer.parseInt(args[0]);
		int finalbill =Integer.parseInt(args[1]);

		if(UnitOfBill<100)
		{
			int finalBill=160;
			System.out.println("The Unit are :" +UnitOfBill+"The bill amount are "+finalBill);
		}
		else if(UnitOfBill>100 && UnitOfBill<25) 
		{
			int final_value=UnitOfBill-100;
			int finalBill=final_value+160;
			System.out.println("The bill amount are"+finalbill);
		}
		else
		{
			int final_value=UnitOfBill-250;
			int fianlbill=(int)(final_value*1.2)+310;


			System.out.println("The Unit are :"+finalbill);
}
	}
}

    

