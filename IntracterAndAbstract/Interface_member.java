package IntracterAndAbstract;


    

interface Printtable
{
	int SPEED=80; //public +static+ final(1.0)
	
	void print(); //public + abstract
	
	public default void m1()   //public 
	{
		m1();
		m3();
		
	}
	static void m2()//public (1.8)
	{
		IO.print("Public m2 static method");
		m4();
	}
	private void m3()//private non static method (9)
	{
		IO.print(" private non static method ");
	}
	private static void m4()  //private static method 
	{
		IO.print(" private static method");
	}
	
}
class print implements Printtable
{
	public String toString()
	{
		return "java";
				
	}
	public  void print()
	{
		IO.println("Priting something");
	}
}

public class Interface_member {
    
	public static void main(String[] args) {
		
       Printtable p=new print();
       IO.print(p);
       p.print();
       p.m1();
       p.equals(p);
       Printtable.m2();
		
	}

}

}
