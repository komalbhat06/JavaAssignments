package com.example;

public class Politician extends Person {
    private int politicalExperience;
    private double salary;

    public Politician(String name, int age, int politicalExperience) {
        super(name, age);
        this.politicalExperience = politicalExperience;
        calculateSalary();
    }

    public void calculateSalary() {
        
        salary = politicalExperience * 10000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Political Experience: " + politicalExperience + " years");
        System.out.println("Salary: $" + salary);
    }
}

