package Multithreading.join;

//find out the output of the below code and explain the concept of join method in java


class Alpha extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();//Alpha thread is current thread
		
		Beta b1=new Beta();
		b1.setName("Beta_Thread");
		b1.start();
		try
		{
			b1.join();
			IO.println("Alpha Thread re-started");
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++)
		{
			IO.println(i+"By "+name);
		}
		
		
		
		
		}
}
public class JoinDemo1 {
	void main()
	{
		Alpha a1=new Alpha();
		a1.setName("Alpha_THread");
		a1.start();
	}

}
class Beta extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		for(int i=1;i<=5;i++)
		{
			IO.println(i+"By"+name);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		IO.println("Beta Thread Ended");
	}
}
