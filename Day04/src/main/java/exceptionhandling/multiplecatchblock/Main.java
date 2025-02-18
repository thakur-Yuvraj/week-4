package exceptionhandling.multiplecatchblock;

public class Main {
    public static void main(String[] args) {
        // Array declaration and initialized with null
        int[] arr = null;
        // Array declaration and given values
        int[] brr = {1, 3, 4, 5};

        // Accessing the elements
        ArrayOperations.accessElement(brr, 5);
        ArrayOperations.accessElement(arr, 5);
    }
}
