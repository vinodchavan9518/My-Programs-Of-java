package Hierarchicanheritance;



    
interface Vehicle
{
	void run();//public abstract void run()
}
public class BankApplication {


	public static void main(String[] args) {
		
		Vehicle car= new Vehicle()//Anonymous inner class
{
			public void run()
			{
				System.out.println("Car is Running");
			}
			
				};
				car.run();

	}
	Vehicle bike =new Vehicle()
			{
		public void run()
		{
			System.out.println("bike is running ");
		}
};
	
}


