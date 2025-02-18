package exceptionhandling.multiplecatchblock;


// ArrayOperation class definition
public class ArrayOperations {
    // Accessing the elements and handling the possible exceptions
    public static void accessElement(int[] arr, int index) {
        try {
            int element = arr[index];
            System.out.println("Element at index " + index + " is: " + element);
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }
}
