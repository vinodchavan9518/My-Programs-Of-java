package Java8Features.LambdaExpressions;
//find the lambda expression in the below code and explain 
public class LambdaDemo3 {
    public static void main(String[] args) {
        {
		Runnable r1=()->
		{
		String  name=Thread.currentThread().getName();
		IO.println("Thread is name"+name);
	};
	Thread t1=new Thread(r1);
	t1.start();
}
    }
    
}
