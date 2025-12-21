package IntracterAndAbstract.LooseCoupling;


    
interface Alpha
{
	 void m1();
	 
}

interface Beta
{
	void m1();
}

class Implementer implements Alpha,Beta
{
	public void m1()
	{
	
		System.out.println("my is possible");
	}
}
public class MultipleInitance {

	public static void main(String[] args)
	{
		new Implementer().m1();

	}

}

}
