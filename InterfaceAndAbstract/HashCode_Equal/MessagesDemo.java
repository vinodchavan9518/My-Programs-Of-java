package InterfaceAndAbstract.HashCode_Equal;


public class MessagesDemo 
{
    void main()
    {
	try 
	{
		
	
 int num1=Integer.parseInt(IO.readln("Enter is first Integer :"));
int num2=Integer.parseInt(IO.readln("Enter is Second Integer "));
System.out.println("you entered a="+num1+"and b="+num2);

	}
	catch(Exception e)
	{
		IO.println(e.getMessage());
		IO.println(e.toString());
		IO.println("InputMismatchException occurred. Please enter only integer numbers. ");
		e.printStackTrace();
		
	}
	IO.println("program complite normaly");
	
    }
}
	
	
	
	
	
	
	