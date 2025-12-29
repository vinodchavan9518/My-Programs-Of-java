package ExecptionHandling;

public class  FincancialTransaction {
    public static void main(String[] args) {
		
	    	   try {
  		   double amount = Double.parseDouble(IO.readln("Enter a amount : "));
  		   Long trac = Long.parseLong(IO.readln("Enter a account number : "));
  		   IO.println("Excepeted Output");
  		   FinancialTransactionDemo fa = new FinancialTransactionDemo();
  		   fa.processTransaction(amount, trac);
  	   }
  	   catch(NumberFormatException e) {
 			IO.println("Invalid input: Please enter a valid number for transaction amount.");
 		}
     }
}
class FinancialTransactionDemo{
	
	public void processTransaction(double amt, long trac) {
		try {
			if(amt > 0 && trac > 0) {
				IO.println("Transaction successful: Amount Rs."+amt+" transferred to account "+trac);
			}
			else  {
				throw new RuntimeException();
			}
		}
		
		catch (RuntimeException e) {
			IO.println("Error processing transaction: Transaction amount must be positive.");
		}
	}
}


