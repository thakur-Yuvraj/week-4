//finally Block Execution
// Problem Statement:
//Write a program that performs integer division and demonstrates the finally block execution.
//The program should:
//Take two integers from the user.
//Perform division.
//Handle ArithmeticException (if dividing by zero).
//Ensure "Operation completed" is always printed using finally.
//Expected Behavior:
//        If valid, print the result.
//If an exception occurs, handle it and still print "Operation completed".


package exceptionhandling.finallyblockexecution;

import java.util.Scanner;

public class FinalBlockExecution {
    public static void main(String[] args) {
        // scanner obj
        Scanner scanner = new Scanner(System.in);

        //Take two integers from the user.
        System.out.println("Enter 2 number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //Perform division.
        try {
            //Handle ArithmeticException (if dividing by zero).
            int c = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        // will run regardless of exception
        finally {
            System.out.println("Operation completed");
        }
    }
}
