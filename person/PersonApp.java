package com.example;

public class PersonApp{
    public static void main(String[] args) {
        Politician politician = new Politician("John Doe", 45, 10);
        politician.displayInfo();

        Sportsman sportsman = new Sportsman("Jane Smith", 30, "Tennis");
        sportsman.displayInfo();
    }
}

