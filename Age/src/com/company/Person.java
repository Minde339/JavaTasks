package com.company;

public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        if (age >= 13 && age < 18) {
            System.out.println("You a teenager.");
        } else if (age >= 18) {
            System.out.println("You are old.");
        } else {
            System.out.println("You are young.");
        }
    }

    public void yearPasses() {
        age++;
    }
}