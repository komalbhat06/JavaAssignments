package com.example;

public class TaxCalculator {
    public static double calculateIncomeTax(double earnings) {
        double tax = 0.0;
        if (earnings <= 50000) {
            tax = 0;
        } else if (earnings <= 60000) {
            tax = (earnings - 50000) * 0.1;
        } else if (earnings <= 150000) {
            tax = 10000 + (earnings - 60000) * 0.2;
        } else {
            tax = 31000 + (earnings - 150000) * 0.3;
        }

        return tax;
    }
}
