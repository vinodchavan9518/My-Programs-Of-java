package ExecptionHandling;

class InvalidAgeException extends Exception
{
	private static final long seriaLVersionUID=1L;
	
	
	public InvalidAgeException()
	{
		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}



public class CustomerCheckException {
	void main()
	{
		try {
			IO.print("Enter your Age:");
			int age=Integer.parseInt(IO.readln());
			validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			IO.print(e);
			IO.print(e.getClass());
			e.printStackTrace();
		}
	}
	public void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is Invalid");
		}
		else
		{
			IO.println("you can go for a movie");
			
		}
	}

	
}