package LambdaExpression;
 


class Accept<T> //Type parameter
{
	private T data;
	
	public Accept(T data)
	{
		super();
		this.data=data;
	}
	public T getdate()
	{
	return this.data;
	}
	
}
class Students
{
	String name;
	int id;
	
	public Students(String name,int id)
	{
		super();
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}
	
}




public class Type_parameter {

	public static void main(String[] args) {
	
		Accept<Integer>intType=new Accept<Integer>(12);
		System.out.println("Integer type :"+intType.getdate());

         Accept<Character>charType=new Accept<Character>('A');   
         System.out.println("Character type is :"+charType.getdate());
         
         Accept<Double>doubleType=new Accept<Double>(12.8);
         System.out.println("Double type is:"+doubleType.getdate());
         
         Accept<String>stringType=new Accept<String>("vinod");
         System.out.println("String is name:"+stringType.getdate());
         
     
         Accept<Students> studType=new Accept<Students>(new Students("vinod",111));
         System.out.println("Students is name:"+studType.getdate());
         
	}

}


