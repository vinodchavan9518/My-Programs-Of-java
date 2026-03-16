package Multithreading.LimitationOfObjectLevelSyn;
//the is programing is to show the limitation of object level synchronization
class Table
{
    public synchronized void printTable(int n)
    {
        for(int i=1;i<=5;i++)
        {
            IO.println(n+"*"+i+"="+(n*i));
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}



public class LimitationOfObjectLevel {
	void main()
	{
		Table obj1=new Table();//lock1
		Table obj2=new Table();//lock2
		
		Thread t1=new Thread()
				{
			public void run()
			{
				obj1.printTable(5);//lock1
			}
				};
				
				
			Thread t2=new Thread()
					{
				public void run()
				{
					obj2.printTable(7);//lock1
				}
					};
					
				
					Thread t3=new Thread()
					{
				public void run()
				{
					obj2.printTable(12);//lock2
				}
					};
					
					
					Thread t4=new Thread()
					{
				public void run()
				{
					obj2.printTable(15);//lock2
				}
					};
					
				
				
				
			t1.start(); t2.start(); t3.start(); t4.start();	
				
	}

}
