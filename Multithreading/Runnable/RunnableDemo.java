package Multithreading.Runnable;
//the is programing is to show the concept of runnable interface in java

class Text implements Runnable
{
	public void run()
	{
		
String name=Thread.currentThread().getName();
		
		IO.println("Running thread name is:"+name);
	
	}
}
public class RunnableDemo {
	public static void main()
	{
		
var t1=new Thread(new Text());
t1.start();

	}
	
		
		
}
