package com.example;

public class Sportsman extends Person {
    private String sport;
    private double salary;

    public Sportsman(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
        calculateSalary();
    }

    public void calculateSalary() {
        // Perform salary calculation based on sport
        // For simplicity, let's assume a fixed salary amount
        salary = 50000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sport: " + sport);
        System.out.println("Salary: $" + salary);
    }
}

