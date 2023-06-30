package project8;

public class SavingAccount implements Account {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double calculateInterest() {
        double interestRate = 0.07; 
        return balance * interestRate;
    }

    public double viewBalance() {
        return balance;
    }

	

    
}

