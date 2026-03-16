package Multithreading.Limitation_thread;

//find out the output of the below code and explain the concept of join method in java
class Customer implements  Runnable 
{
	private int availableSeat=1;
	private int wantedSeat;
	
	
	public Customer (int wantedSeat)
	{
		super();
		this.wantedSeat=wantedSeat;
	}

	public void run()
	{
		String name=null;
		if(availableSeat>=wantedSeat)
		{
			name=Thread.currentThread().getName();
			IO.println(wantedSeat+"Breath is reseved for "+name);
			availableSeat =availableSeat-wantedSeat;
			
		}
		else
		{
			name=Thread.currentThread().getName();
			IO.println("Sorry "+name+"seat is not avaible");
			
		}
	}



public class IRCTC {
	void main()
	{
		Customer c1=new Customer(1);
		Thread t1=new Thread(c1,"Scott");
		Thread t2=new Thread(c1,"Alen");
		
		t1.start();
		t2.start();
		
	}
}

}
