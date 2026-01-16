package Collection_Framerwork.GenericType;

public class Demo {
    public  static void checkupAnimals(Animal ...animals)
	{
		for(Animal animal:animals)
		{
			animal.checkup();
		}
	}
	void main()
	{
		Lion[]lion= {new Lion(),new Lion()};
		Cat[]cats= {new Cat(),new Cat()};
		Brid[]bird= {new Brid(),new Brid()};
		
		checkupAnimals(bird);
		checkupAnimals(cats);
		checkupAnimals(lion);
		

	}
}

abstract class Animal
{
	public abstract void checkup();
}


 class Lion extends Animal
{   
	@Override
	public void checkup()
	{ 
		
		IO.println("lion checkup");
	}
}
class Cat extends Animal
{
	@Override
	public void checkup()
	{
		IO.println("Cat checkup");
	}
}
class Brid extends Animal
{
	@Override
	public void checkup()
	{
		IO.println("Brid Checkup");
}
}


    

