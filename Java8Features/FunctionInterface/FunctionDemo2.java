package Java8Features.FunctionInterface;

@FunctionalInterface
interface Addition {
    int add(int a, int b);
}
public class FunctionDemo2 {

    public static void main(String[] args) {
        Addition addition = (a, b) -> a + b;
        int result = addition.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}
