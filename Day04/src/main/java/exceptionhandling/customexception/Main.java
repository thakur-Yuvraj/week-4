package exceptionhandling.customexception;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Accessing the resource in try block // Scanner class
        try (Scanner input = new Scanner(System.in)) {
            // command to enter age
            System.out.println("Enter the age: ");
            int age = input.nextInt(); // age variable taking input

            validateAge(age); // Method invocation for validating the age
        } catch (InvalidAgeException e) { // Catch block for handling invalid age exception
            System.out.println(e.getMessage());
        }
    }

    // Method definition for validating the age
    public static void validateAge(int age) throws InvalidAgeException {
        // throwing the invalid age exception for lesser age
        if(age < 18) throw new InvalidAgeException("Age must be greater than 18.");

        // Otherwise granting the access
        System.out.println("Access granted!");
    }
}
