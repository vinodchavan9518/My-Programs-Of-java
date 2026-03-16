package Multithreading.Runnable;
//the is programing is to show the concept of assigning target to thread in java

class Tatkal implements Runnable
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		IO.println(name+" Has Booked the ticket under tatkal Scheme");
		
	}
}

class PermimumTatkal implements Runnable
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		IO.println(name+"Has Booked the ticket under premimumtakal Schem");
				
	}
}
public class AssigingTarget {
	void main()
	{
		var vinod=new Thread(new Tatkal(),"vinod");
		var scott=new Thread(new PermimumTatkal(),"scott");
		vinod.start();
		scott.start();
	}
	

}
