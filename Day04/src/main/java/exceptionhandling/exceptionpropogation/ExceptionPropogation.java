//Exception Propagation in Methods
//💡 Problem Statement:
//Create a Java program with three methods:
//method1(): Throws an ArithmeticException (10 / 0).
//method2(): Calls method1().
//main(): Calls method2() and handles the exception.
//Expected Behavior:
//The exception propagates from method1() → method2() → main().
//Catch and handle it in main(), printing "Handled exception in main".

package exceptionhandling.exceptionpropogation;

public class ExceptionPropogation {

    //method1(): Throws an ArithmeticException (10 / 0).
    public static void method1() {
        int a = 10 / 0;
    }

    //method2(): Calls method1().
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {

        //  main method Calls method2() and handles the exception.
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main : " + e.getMessage());
        }
    }
}
