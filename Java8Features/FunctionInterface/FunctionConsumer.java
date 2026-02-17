package Java8Features.FunctionInterface;
import java.util.function.Consumer;
public class FunctionConsumer {
    
    public static void main(String[] args) {

        Consumer<String> print = name -> 
            System.out.println("Hello " + name);

        print.accept("Vinod");
    }
}

    

