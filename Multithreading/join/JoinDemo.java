package Multithreading.join;


class Join extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		IO.println(name+"Thread started");
		
		for(int i=1;i<=5;i++)
		{
			IO.println(i+"by"+name+"Thread");
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		IO.println(name+"Thread completed");
	}
}


public class JoinDemo {
	void main() throws InterruptedException
	{
		IO.println("Main Thread Started");
		
		Join j1=new Join();
		Join j2=new Join();
		Join j3=new Join();
		
		j1.setName("j1");j2.setName("j2");j3.setName("j3");
		
		j1.start();
		
		j1.join();
		IO.println("Main Thread wake up" );
		
		j2.start();
		j3.start();
		
		IO.println("Main Thread Ended");
		
	}

}
