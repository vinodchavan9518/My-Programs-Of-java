package Multithreading.PriorityThread;
//the is programing is to show the concept of priority thread in java



class UserThread implements Runnable
{
	public void run()
	{
		
	
	int priority=Thread.currentThread().getPriority();
	String name=Thread.currentThread().getName();
	
	int count =0;
	for(int i=1;i<=100000;i++)
	{
		count++;
		
	}
	IO.println("Thread name is :"+name);
	IO.println("The thread priorty is:"+priority);
}
}

public class PriorityDemo {
	void main()
	{
		UserThread ut=new UserThread();
		
		Thread t1=new Thread(ut,"Last_Thread");
		Thread t2=new Thread(ut,"Last_Thread");
		
		
		t1.setPriority(Thread.MIN_PRIORITY);//Lowest Priority
		t2.setPriority(Thread.MAX_PRIORITY);//highest priority

		
		t1.start();  t2.start();
	}

}
