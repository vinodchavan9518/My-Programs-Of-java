package Java8Features.ForEachMethod;
//the forEach method is a default method in the Iterable interface that allows you to perform an action for each element in a collection. It takes a lambda expression or a method reference as an argument, which defines the action to be performed on each element.
public class ForEachDemo {
    public static void main(String[] args) {
        String[] names = {"Vinod", "Ravi", "Sita", "Gita"};

        // Using forEach with a lambda expression
        System.out.println("Using forEach with a lambda expression:");
        java.util.Arrays.asList(names).forEach(name -> System.out.println(name));

        // Using forEach with a method reference
        System.out.println("\nUsing forEach with a method reference:");
        java.util.Arrays.asList(names).forEach(System.out::println);



    }
    
}
