package IntracterAndAbstract;


    abstract class Vehicle
{
	public abstract void run();
}
public class AstractsAnonymousInner
  {

	public static void main(String[] args) 
	{
		Vehicle car =new Vehicle()
				{
			public void run()
			{
			System.out.println("Car is running ");	
			}
				
				};
				car.run();
				
				Vehicle bike=new Vehicle()
						{
					public void run()
					{
						System.out.println("Bike is running ");
					}
						};
						bike.run();
						
						new Vehicle()
						{
							public void run()
							{
								System.out.println("Bus is running ");
							}
						}.run();
						
				
	
	
			
				
		

	}

}

}
