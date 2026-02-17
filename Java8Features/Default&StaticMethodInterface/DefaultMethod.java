package Java8Features;
//find the method reference for the following code
public class DefaultMethod {
public static void main(String[] args) {
		
		Vehicle v=null;
		v= (Vehicle) new Car(); v.run(); v.horn(); v.digitalMester();
		System.out.println("=====================================");
		v= (Vehicle) new Bike(); v.run(); v.horn();v.digitalMester();
		

	}

}
 interface Vehicle 
{
	void run();
	void horn();
	
	
	default void digitalMester()
	{
		System.out.println("Digital facility coning soon");
	}

}
    class Bike  implements Vehicle
{

	public void run()
	{
		System.out.println("Bike is running");
	}
	public void horn()
	{
		System.out.println("Bike is havi g horn facility");
	}
}
class Car implements Vehicle
{

    public void run()
    {
        System.out.println("Car is running");
    }
    public void horn()
    {
        System.out.println("Car is havi g horn facility");
    }
}


 