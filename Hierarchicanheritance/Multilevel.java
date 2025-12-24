package Hierarchicanheritance;


    class Animal
{
	public void eat()
	{
		System.out.println("Animmal is Eating");
		
	}
}
class Mammal extends Animal
{
	public void walk()
	{
	System.out.println("Mammal is Walking");	
	}

}
class Dog extends Mammal
{
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();
		dog.walk();
		dog.bark();
		

	}

}

    

