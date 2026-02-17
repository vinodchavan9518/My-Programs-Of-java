package Java8Features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//collect() method is used to collect the elements of a stream into a collection. It is a terminal operation that transforms the stream into a different form, such as a List, Set, or Map. The collect() method takes a Collector as an argument, which defines how the elements should be collected and what type of collection should be returned.
public class CollectDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript");
        List<String> result = list.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
    
}
