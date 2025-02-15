package junit.basic.testinglistoperations;
import java.util.List;

public class ListManager {

    // Adds an element to the list
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Removes an element from the list
    public static boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }

    // Returns the size of the list
    public static int getSize(List<Integer> list) {
        return list.size();
    }
}