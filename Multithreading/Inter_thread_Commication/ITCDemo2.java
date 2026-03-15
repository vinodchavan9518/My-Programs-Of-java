package Multithreading.Inter_thread_Commication;



class Demo implements Runnable
{
	int data=0;
	
	public void  run()
	{
		synchronized (this) {
			IO.println("Child thread got the lock");

			
			for(int i=1;i<=1000;i++)
			{
				data=data+i;
				
			}
			IO.println("Sending notification to main thread");
			notify();
		}
	}
}

public class ITCDemo2 {
	void main() throws InterruptedException
	{
		Demo d1=new Demo();
		Thread t1=new Thread(d1);
		t1.start();
		
		synchronized (d1) {
			
			IO.println("Main Thread is going to wait after releasing the lock ");
			d1.wait();
			IO.println("main Thread got notification");
			
			IO.println("Main thread got notification ");
			IO.println(d1.data);
			
		}
		
	}

}
