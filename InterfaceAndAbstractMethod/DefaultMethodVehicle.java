package InterfaceAndAbstractMethod;

public class DefaultMethodVehicle {
    	public static void main(String[] args) {
		
		Vehicle v=null;
		v= (Vehicle) new Car(); v.run(); v.horn(); v.digitalMester();
		System.out.println("=====================================");
		v= (Vehicle) new Bike(); v.run(); v.horn();v.digitalMester();
		

	}

}

    
interface Vehicle
{
    default void digitalMester()
    {
        System.out.println("Digital mester interface method ");
    }
    void run();
    void horn();
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
     class Car  implements Vehicle
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