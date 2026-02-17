package Java8Features.Default&StaticMethodInterface;


interface Alpha
{
	default void m1()
	{
		System.out.println("Alpha interface method ");
	}
}
interface Beta
{
	default void m1()
	{
		System.out.println("Beta interface method ");	
	}
}

interface Child
{
	default void m1()
	{
		
		System.out.println("Child interface method ");
	}
}
class Implementer implements Alpha,Beta,Child
{
	public void m1()
	{
		Alpha.super.m1();
		Beta.super.m1();
		Child.super.m1();
		System.out.println(" MI possible by using default method also ");
	}
}


public class MultipleInteranteceDefault {

	public static void main(String[] args) {
		
		new Implementer().m1();
		
		
	

	}

}
