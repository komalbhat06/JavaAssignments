package com.example;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankDatabase bankDB = new BankDatabase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bank Application");
        System.out.println("----------------");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankDB.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankDB.withdraw(withdrawAmount);
                    break;
                case 3:
                    double balance = bankDB.getBalance();
                    System.out.println("Current balance: " + balance);
                    break;
                case 4:
                    exit = true;
                    System.out.println(" Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

