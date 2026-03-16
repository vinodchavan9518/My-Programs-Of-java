package Multithreading.PriorityThread;

//the is programing is to show the concept of priority thread in java


class UserThread1 implements Runnable
{
	public void run()
	{
		int priority=Thread.currentThread().getPriority();
		String name=Thread.currentThread().getName();
		
		int count=0;
		
		for(int i=1;i<=10000000;i++)
		{
			count++;
			
		}
		IO.println("The Thread name is: "+name);
		IO.println("The thread priority is:"+priority);
		
	}
}


public class PriorityDemo1 {
	void main()
	{
		UserThread1 ut=new UserThread1();
		
		Thread t1=new Thread(ut,"Last_Thread");
		Thread t2=new Thread(ut,"First_thread");
		Thread t3=new Thread(ut,"Median_thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		
		t1.start(); t2.start(); t3.start();
		
		
	}

}
