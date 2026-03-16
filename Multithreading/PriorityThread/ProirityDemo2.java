package Multithreading.PriorityThread;

//the is programing is to show the concept of priority thread in java



class MyThread implements Runnable
{
	public void run()
	{
	int priority=Thread.currentThread().getPriority();
	IO.println("Child Thread priorty is :"+priority);
	
	}
	
}

public class ProirityDemo2 {
	void main()
	{
		Thread t1=Thread.currentThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		
		//t1.setPriority(11);//java.lang.IllegalArgumentException
		
		IO.println("Main Thread priority is :"+t1.getPriority());
		
		Thread t2=new Thread(new Thread());
		t2.start();
		
	}

}
