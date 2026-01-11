package ExecptionHandling;
public class Tester {

	public static void main(String[] args) {
		
		
		
		
	}

}
class ParentClass {
	
	public void LoadingClass(String name)throws ClassNotFoundException
	{
	
		{
		Class<?>classLoder=Class.forName(name);
		IO.print("Class"+name+"Loaded successfully");
		
		}
		
	}

}
class ChildClass extends ParentClass {
	
	public void LoadingClass(String name)throws IllegalArgumentException, ClassNotFoundException 		
	{
		
		Class<?>classLoader=Class.forName(name);
		IO.print("Class"+name+"Laoded successfully");
	}

}
