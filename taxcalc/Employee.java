package com.example;
import java.util.Scanner;
public class Employee {

	private static double tax;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's earnings: ");
        double earnings = scanner.nextDouble();

        tax = TaxCalculator.calculateIncomeTax(earnings);

        System.out.println("Earnings: " + earnings);
        System.out.println("Income Tax: " + tax);

        scanner.close();
    }

}
