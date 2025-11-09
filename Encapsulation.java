class BankAccount {
    private double balance; // data hidden

    // public method to access data
    public double getBalance() {
        return balance;
    }

    // public method to modify data safely
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount!");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdrawal!");
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        
        account.withdraw(400); // Invalid withdrawal
    }
}
