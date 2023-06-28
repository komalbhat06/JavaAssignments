package com.example;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Politician("Sidhu", 45, 10);
        displayPersonInfo(person1);

        Person person2 = new Sportsman("Shuru", 30, "Cricket");
        displayPersonInfo(person2);
    }

    public static void displayPersonInfo(Person person) {
        person.displayInfo();

        if (person instanceof Politician) {
            System.out.println("Person is a Politician");
        } else if (person instanceof Sportsman) {
            System.out.println("Person is a Sportsman");
        }

        System.out.println();
    }
}


