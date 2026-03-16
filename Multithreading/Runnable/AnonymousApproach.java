package Multithreading.Runnable;
//the is programing is to show the concept of anonymous approach in java
public class AnonymousApproach {
	void main()
	{
		Runnable r1=new Runnable() {
			
			public void run()
			{
				String name=Thread.currentThread().getName();
				IO.println("Thread  name is:"+name);
				
			}
		};
		
		Thread t1=new Thread(r1,"Child1");
		t1.start();
		
	}
	
					


}
