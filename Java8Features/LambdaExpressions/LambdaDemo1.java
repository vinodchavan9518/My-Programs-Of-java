package Java8Features.LambdaExpressions;
//find the lambda expression in the below code and explain it
public class LambdaDemo1 {
    public static void main(String[] args) {
        // Lambda expression to implement Runnable interface
        Runnable runnable = () -> System.out.println("Hello from a lambda expression!");
        
        // Running the thread
        Thread thread = new Thread(runnable);
        thread.start();
    }
    
}
