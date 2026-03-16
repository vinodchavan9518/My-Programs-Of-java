package Multithreading;
//the is programing is to show the concept of inter thread communication in java

    
    class Customer 
    {
        private double balance=10000;
        
        public synchronized void withdraw(double amount)
        {
            IO.println("Going to withdraw");
            if(amount >this.balance)
            {
                try
                {
                    IO.println("Less balance ,waiting for deposit");
                    wait();
                    
                }
                catch(InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                    
                }
            }
            this.balance=this.balance-amount;
            IO.println("Amount after Withdraw is :"+this.balance);
            
        }
        public synchronized void deposit(double amount)
        {
            IO.println("Going to deposit");
            this.balance=this.balance+amount;
            IO.println("Balance after deposit is :"+this.balance);
            notify();
        }
        
    }
    
    
    public class CustomerBank {
        void main()
        {
            Customer c1=new Customer();
            
            Thread son=new Thread()
                    {
                public void run()
                {
                    c1.withdraw(150000);
                }
                    };
                    son.start();
                    
                    Thread dad=new Thread()
                            {
                        public void run()
                        {
                            c1.deposit(10000);
                        }
                            };
                            
                            dad.start();
        }
    
    }
    




