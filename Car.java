
import java.util.Scanner;


public class Car {
	
	
	String name;
	int modelCar;
	String color;
	
	public void setCarInformation() {
		Scanner sc =new Scanner(System.in);
		System.out.println("name:");
		name= sc.nextLine();
		System.out.println("modelCar:");
		modelCar = Integer.parseInt(sc.nextLine());
		System.out.println("color:");
		color= sc.nextLine();
		sc.close();
	}
	public void getCarInformation() {
		
		System.out.println("name:"+name);
		System.out.println("modelCar:"+modelCar);
		System.out.println("color:"+color);
	}
		
	
	
	public static void main(String[]args) {
		
		Car c=new Car();
//		c.name="bmw";
//		c.modelCar=2026;
//		c.color="black";
	    c.setCarInformation();
		c.getCarInformation();
		
	}
		
	}
	



	



