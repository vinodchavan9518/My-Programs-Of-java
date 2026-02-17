package Java8Features.FunctionInterface;
import java.util.function.Function;
// Function<T, R> is a functional interface that represents a function that takes an argument of type T and returns a result of type R. It has a single abstract method called apply() that takes an argument of type T and returns a result of type R.
public class FunctioFunction {




    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5));  // 25
    }
}

    

