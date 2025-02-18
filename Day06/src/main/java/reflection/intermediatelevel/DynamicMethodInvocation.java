package reflection.intermediatelevel;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{

    // Method to add two numbers
    public int add(int a , int b){
        return a+b;
    }

    // Method to subtract two numbers
    public int subtract(int a , int b){
        return a-b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b){
        return a*b;
    }

}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = input.nextInt(); // Read the first number from the user

        System.out.println("Enter second number : ");
        int num2 = input.nextInt(); // Read the second number from the user

        System.out.println("Enter choice (add,subtract,multiply) : ");
        String choice = input.next(); // Read the user's choice of operation

        // Load the MathOperations class
        Class<?> cls = Class.forName("reflection.intermediatelevel.MathOperations");

        // Get the method corresponding to the user's choice
        Method method = cls.getDeclaredMethod(choice,int.class, int.class);

        // Create an instance of MathOperations
        MathOperations mathOperations = new MathOperations();

        // Invoke the selected method dynamically
        int result = (int) method.invoke(mathOperations,num1,num2);

        // Print the result of the operation
        System.out.println("Result is : "+result);
    }
}