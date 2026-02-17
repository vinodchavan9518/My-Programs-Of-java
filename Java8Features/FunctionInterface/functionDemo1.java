package Java8Features.FunctionInterface;

@FunctionalInterface
interface MyFunctionalInterface {
    void display();//no parameter and no return type
}

public class functionDemo1 {
    public static void main(String[] args) {
        
    MyFunctionalInterface obj = () -> {
            System.out.println("Hello Functional Interface");
        };

        obj.display();

    }
    
}
