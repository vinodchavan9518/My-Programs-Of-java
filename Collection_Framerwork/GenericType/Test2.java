package Collection_Framerwork.GenericType;

public class Test2 {
    void main()
	{
		Basket<Fruit> bast=new Basket<>();
		bast.setElement(new Orginal());
		Orginal fruit=(Orginal)bast.getElement();
		IO.println(fruit.toString());
		
	}
}
class Fruit
{
	
}
class Orginal extends Fruit
{
	public String toString()
	{
		return "Orangle Seanson";
		
	}
}
class Basket<E>  //E is of type fruit
{
	private E element;

public void setElement(E element)//Fruit element
{
 this.element=element;
 
}
public E getElement()
{
	return this.element;
}
}



