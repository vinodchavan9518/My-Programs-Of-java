package Record;

    

class Calcul<T>
{
	int sum(int x,int y)
	{
		return (x+y);
	}
	
}



public class CalculatDemo {

	public static void main(String[] args) {
		
		Calcul<Integer>intType=new Calcul<Integer>();
		System.out.println("sum addition is:"+intType.sum(12, 12));
		
		
		Calcul<Double>doubleType=new Calcul<>();
		System.out.println("Double is Sum:"+doubleType.sum(1, 2));
		
		Calcul<Long>longType=new Calcul<Long>();
		System.out.println("Long Number :"+longType.sum(23, 12));
		

	}

}


