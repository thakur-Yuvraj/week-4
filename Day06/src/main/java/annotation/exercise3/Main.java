package annotation.exercise3;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create an ArrayList without generics
        ArrayList list = new ArrayList();

        // Add elements to the list
        list.add("Hello");
        list.add(123); // This will cause a warning if generics were used

        // Print the list
        System.out.println("List contents: " + list);
    }
}