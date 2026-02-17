package Java8Features.ForEachMethod;

import java.util.Arrays;
import java.util.List;
//the forEach method is a default method in the Iterable interface that allows you to perform an action for each element in a collection. It takes a lambda expression or a method reference as an argument, which defines the action to be performed on each element.
public class ForEachDemo1 {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        System.out.println("forEach:");
        names.stream().forEach(System.out::println);

    }


    
}
