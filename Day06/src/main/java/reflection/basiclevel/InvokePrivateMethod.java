package reflection.basiclevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// A class with a private method
class Calculator {
    // Private method to multiply two integers
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Get the Class object associated with the Calculator class
        Class<?> cls = calculator.getClass();

        // Get the private method "multiply" with parameter types int and int
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        // Set the method as accessible to bypass the private access restriction
        method.setAccessible(true);

        // Invoke the private method on the calculator instance with arguments 3 and 5
        int result = (int) method.invoke(calculator, 3, 5);

        // Print the result of the multiplication
        System.out.println("Multiplication : " + result);
    }
}