package InterfaceAndAbstractMethod.InnerClass;
    

class Laptop
{
	private String brand;
	private String model;
	private Motherboard motherboard;
	
	
	public Laptop(String brand,String model,String motherboardModel,String chipset)
	{
		this.brand=brand;
		this.model=model;
        this.motherboard=new Motherboard(motherboardModel,chipset);
	}
	public void switchon()
	{
		IO.println("Turning on "+brand+" "+model);
		this.motherboard.boot();
	}
	//MotherBoard inner class
	private class Motherboard
	{
		private String model;
		private String chipset;
		
		
		public Motherboard(String model,String chipset)
		{
			this.model=model;
			this.chipset=chipset;
		}
		
		public void boot()
		{
			IO.println("Booting "+brand+""+model+" with"+chipset+" chipset");
		}
		
	}
}


public class LaptopDemo {

	public static void main(String[] args) {
	  
		Laptop lap=new Laptop("HP","ENVY","IRIS","Intel");
		lap.switchon();

	}

}


