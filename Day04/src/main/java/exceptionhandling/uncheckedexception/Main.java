package exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Command for entering the numbers
        System.out.println("Enter two number: ");

        // In try block accessing the resource and performing the operation
        try(Scanner input = new Scanner(System.in)) {
            // Enter the values
            int a = input.nextInt();
            int b = input.nextInt();
            // Perform division operation
            int c = a / b;

            // Printing the result
            System.out.println("Result of dividing two number is: " + c);
        } catch (InputMismatchException | ArithmeticException e) { // Catch block for handling exceptions
            System.out.println(e);
        }
    }
}

