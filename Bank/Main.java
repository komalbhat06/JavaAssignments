package project8;

public class Main {

	public static void main(String[] args) {
				Bank bank = new Bank();

		        SavingAccount savingsAccount = new SavingAccount(1000);
		        savingsAccount.deposit(500);
		        savingsAccount.withdraw(200);
		        double savingsInterest = savingsAccount.calculateInterest();
		        double savingsBalance = savingsAccount.viewBalance();

		        System.out.println("Savings Account Balance: " + savingsBalance);
		        System.out.println("Savings Account Interest: " + savingsInterest);
		        
		        CurrentAccount currentAccount = new CurrentAccount(1000);
		        savingsAccount.deposit(500);
		        savingsAccount.withdraw(200);
		        double currentInterest = currentAccount.calculateInterest();
		        double currentBalance = currentAccount.viewBalance();

		        System.out.println("Current Account Balance: " + currentBalance);
		        System.out.println("Current Account Interest: " + currentInterest);
		    }

	}


