package InterfaceAndAbstract.MethodOverridingAndOverding;
import java.util.Scanner;

public class BanksAccountDemo{

	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	       System.out.println("Please select the Account Type :");
	        System.out.println("\t1) Saving Account");
	        System.out.println("\t2) Current Account");
	        System.out.println("\t3) Fixed Deposit Account");
	        System.out.print("Please enter the type of account you want to open : [1/2/3] ");

	        int choice = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter account Holder Name :");
	        String name = sc.nextLine();

	        System.out.print("Enter account Number :");
	        String number = sc.nextLine();

	        System.out.print("Enter the Amount :");
	        double amount = sc.nextDouble();

	    
	        if(amount>=0)
	        {
	         switch (choice) 
	         {

	                case 1:
	                    SavingsAccount sa = new SavingsAccount(name, number, amount);
	                    sa.displayAccountDetails();
	                    sa.calculateInterrest();
	                    break;

	                case 2:
	                    CurrentAccount ca = new CurrentAccount(name, number, amount);
	                    ca.displayAccountDetails();
	                    ca.calculateInterest();
	                    ca.checkOverdraftLimit();
	                    break;

	                case 3:
	                    System.out.print("Enter the deposit term [For How many years you want to deposit] :");
	                    int term = sc.nextInt();
	                    if(term>=0){
	                    FixedDepositAccount fda = new FixedDepositAccount(name, number, amount, term);
	                    fda.displayAccountDetails();
	                    fda.calculateInterrest();
	                    
	}
	else{System.out.println("Deposit term must be positive.");
	}
	break;
    default:
	 System.out.println("Invalid option. Please select 1/2/3");
	  }

	  }
	    
	   else{System.out.println("Balance cannot be negative.");}
	   }

      //sc.close();
	   }

	  class BankAccount
	 {
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE="SBIHYD151285";

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		if(accountHolderName.isEmpty())
		{
			System.out.println("Account holder name cannot be empty.");

		}
		   if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
	           throw new IllegalArgumentException("Account holder name cannot be empty.");
	       }
	       if (accountNumber == null || accountNumber.trim().isEmpty()) {
	           throw new IllegalArgumentException("Account number cannot be empty.");
	       }
	       if (balance < 0) {
	           throw new IllegalArgumentException("Balance cannot be negative.");
	       }
	}

	public void calculateInterrest()
	{
		System.out.println("Bank interest calculation depends on account type.");	
	}
	public void displayAccountDetails()
	{
		System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance RS :"+balance);
		System.out.println("IFSC CODE :"+IFSC_CODE);
		
	}

	}

	class SavingsAccount extends BankAccount
	{
		protected double interestRate=4.0;

		public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
			super(accountHolderName, accountNumber, balance);
			
		}

		 @Override
		    public void calculateInterrest() {
		        double interest = (balance * interestRate) / 100;
		        System.out.println("Savings Account Interest RS :" + interest);
		    }
	}

	class CurrentAccount extends BankAccount
	{
		protected double overdraftLimit = 5000.0;

		public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
			super(accountHolderName, accountNumber, balance);
		
		}
		
		public void calculateInterest()
		{
			System.out.println("Current accounts do not earn interest.");
			
		}
		public void checkOverdraftLimit()
		{
			System.out.println("Overdraft limit RS :"+overdraftLimit);
			
		}
	}

	class FixedDepositAccount extends BankAccount
	{
		protected double interestRate = 6.5;
	protected int depositTerm;
	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance,int depositTerm) {
		super(accountHolderName, accountNumber, balance);
		  if (depositTerm <= 0) {
	         System.out.println("Deposit term must be positive.");
	      }

	      this.depositTerm = depositTerm;
	}

	@Override
	public void calculateInterrest()
	{
	    double interest = (balance * interestRate * depositTerm) / 100;
	    System.out.println("Fixed Deposit Interest for " + depositTerm + " years RS :" + interest);
	}

	}