package InterfaceAndAbstractMethod.InnerClass;


    class Car
{
	private String make;
	private String model;
	private Engine engine;
	
	public Car(String make,String model,int horsePower)
	{
		this.make=make;
		this.model=model;
		this.engine=new Engine(horsePower);
	}
	//inner class
	private class Engine{
		private int horsePower;
		
		public Engine(int horesPower)
		{
			this.horsePower=horsePower;
		}
		public void start()
		{
			IO.println("Engine started  horsepower:"+horsePower);
			
		}
		public void stop()
		{
			IO.println("Engine Stopped:");
		}
	}

//inner class closed
	
	//Outer class open
public void startCar()
{
	IO.println("Starting "+make+" "+model);
	this.engine.start();
	
}
public void stopCar()
{
	IO.println("Stopping "+make+" "+model);
	this.engine.stop();
}


public class CarDemo {

	public static void main(String[] args) {
		  
		Car myCar= new Car("Naxon","EV",2300);
		
		myCar.startCar();
		
		myCar.stopCar();
	}

}
}

