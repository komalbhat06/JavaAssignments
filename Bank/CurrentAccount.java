package project8;

public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double calculateInterest() {
    	 double interestRate = 0.03; 
         return balance * interestRate; 
    }

    public double viewBalance() {
        return balance;
    }

    
}
