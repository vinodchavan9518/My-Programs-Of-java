package LambdaExpression;

interface Vehicle
{
	void run();
	
}


public class VehicalLambda_expression {

	public static void main(String[] args) {
		
		Vehicle car =()-> System.out.println("Car is running");
		car.run();
		
		Vehicle bike =()->System.out.println("Bike is running ");
		bike.run();

	}

}

