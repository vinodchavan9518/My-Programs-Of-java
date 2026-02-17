package Java8Features.LambdaExpressions;
// Lambda expressions are a new feature in Java 8 that allow you to write more concise and functional code. They are essentially anonymous functions that can be used to implement functional interfaces, which are interfaces with a single abstract method. Lambda expressions can be used to replace anonymous inner classes and make your code more readable and maintainable.
public class Lambda1Demo {
    public static void main(String[] args) {
       {     //With Ref
		Thread t1=new Thread(()->IO.println(Thread.currentThread().getName()),"Child1");
		t1.start();
		
		//Without Ref
	  new Thread(()->IO.println(Thread.currentThread().getName()),"Child2").start();
	}

}
 

    }
    

