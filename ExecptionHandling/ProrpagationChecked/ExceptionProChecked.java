package ExecptionHandling.ProrpagationChecked;

public class ExceptionProChecked {
    public static void main(String[] args) throws ClassNotFoundException
			{
				
				IO.println("Main method started");
				try
				{
					m1();
					
					}
				catch(ClassCastException e)
				{
					IO.println("Class not found extion handled main method ");
				}
				IO.print("Main method ended");
			}
				public static void m1() throws ClassNotFoundException
				{
					IO.println("M1 method started");
					m2();
					IO.println("m1 method ended");
				}
				
				public static void m2() throws ClassNotFoundException
				{
					IO.println("M2 method started");
					 Class.forName("com.vinod.exceptionHanding.Foo");
					 IO.println("m2 method ended");
				}
				

			



	}

	class Foo
		{
			static {
				IO.println("static block of Foo class ");
			}
		}

	


