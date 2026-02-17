package Java8Features.ConstructorRef;
import java.util.function.Supplier;
//find the method reference for the following code
class Sample
{
	public Sample()
	{
		IO.println("No Argurment constructor of Sample class");
	}
	public void greet()
	{
		IO.println("Hello EveryOne");
	}
}


public class Demo1 {
	
	void main()
	{
		Supplier<Sample> s1=Sample::new;
		Sample sample=s1.get();
		sample.greet();
	}

}
