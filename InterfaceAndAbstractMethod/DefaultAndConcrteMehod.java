package InterfaceAndAbstractMethod;


    

interface Dog
{
	default void show()
	{
		System.out.println("default show interface method A");
	}
}
class Cate
{
	public  void show() //second private 
	{
		System.out.println("Concreate show method of class B ");
	}
}
//class Dog1 extends Cate implements Dog//first private
//{
	//public  void show ()
	//{
		//System.out.println("Dog is running is mehod ");
	//}
//}
public class DefaultAndConcrteMehod {

	public static void main(String[] args) {
		
		Cate dog =new Cate();
				dog.show();
		

	}

}

    
